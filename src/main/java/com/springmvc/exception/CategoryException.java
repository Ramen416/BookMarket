package com.springmvc.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="요청한 분야를 찾을 수 없음")
public class CategoryException extends RuntimeException {

}
