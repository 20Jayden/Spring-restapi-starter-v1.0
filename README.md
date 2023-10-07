# SpringBoot(SpringMVC) RestAPI CRUD + DB(PostgreSQL)
> SpringBoot RestAPI Starter 목적으로 만든 프로젝트이며, Mybatis로 DB(PostgreSQL)와 연결하여 RestAPI를 구현했습니다.

<br>

## 1. 시작 전
### 1.1 테이블 생성

```
CREATE TABLE tb_user(
user_id varchar(30) NOT NULL PRIMARY KEY,
user_nm varchar(20),
email varchar(50),
reg_dt date,
updt_dt date
)
```
### 1.2 데이터 등록

```
INSERT INTO tb_user (user_id, user_nm, email, reg_dt, updt_dt) 
VALUES ('github_name', 'name', 'github_name@github.com', now(), now());
```

<br>

## 2. Start
### 2.1 application.properties 수정

> 로컬 환경에 맞게 설정 값을 입력합니다.
```
# Server 포트 지정
server.port=8080

# database (postgres) 정보입력
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://(IP주소):(포트)/(DB명)
spring.datasource.username=DB 유저명
spring.datasource.password=DB 패스워드

# XML location  (mapper 파일 위치 지정)
mybatis.mapper-locations=classpath:mapper/*.xml

# Swagger 설정
spring.mvc.pathmatch.matching-strategy=ant-path-matcher

# Exception Handler 설정
spring.mvc.throw-exception-if-no-handler-found=true
spring.web.resources.add-mappings=false

# Encoding UTF-8
server.servlet.encoding.charset=UTF-8
server.servlet.encoding.force=true
```

### 2.2 패키지 구조 확인
```
com
 ㄴ example
     ㄴ restapi
         ㄴ common
         |  ㄴ ExceptionController.java
         ㄴ config
         |  ㄴ SwaggerConfig.java
         |  ㄴ WebConfig.java
         ㄴ controller
         |  ㄴ RestApiController.java
         ㄴ mapper
         |  ㄴ RestApiMapper.java
         ㄴ service
         |  ㄴ RestApiService.java
         |  ㄴ RestApiServiceImpl.java
         ㄴ vo
            ㄴ UserVO.java
```

> 해당 프로젝트는 User를 예시로 구현되어 UserVO를 사용합니다.

<br>
<br>
<br>

## 3. 기타(etc)

### 3.1 VO 생성 쿼리(PostgreSQL)
```
SELECT
	'private ' ||
	CASE
		WHEN DATA_TYPE = 'character varying' THEN 'String'
		WHEN DATA_TYPE = 'numeric' THEN 'float'
		WHEN DATA_TYPE = 'integer' THEN 'int'
	END 
	|| ' ' || LOWER(COLUMN_NAME) || ';'
FROM
	INFORMATION_SCHEMA.COLUMNS
WHERE
	TABLE_CATALOG = 'DB명'
	AND TABLE_NAME = '테이블명'
	AND table_schema = '스키마명'
ORDER BY
	ORDINAL_POSITION;
```
