package com.example.restapi.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response ServerException(Exception e) {
        e.printStackTrace();
        return new Response("500", "서버 에러 발생");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Response NotFoundException(Exception e) {
        e.printStackTrace();
        return new Response("404", "요청한 경로를 찾을 수 없습니다.");
    }

    //Response DTO
    static class Response {
        private String code;
        private String msg;
        
        Response(String code, String msg) {
        	this.code = code;
        	this.msg = msg;
        }
        
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
    }
}
