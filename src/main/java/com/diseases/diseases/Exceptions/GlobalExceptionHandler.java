package com.diseases.diseases.Exceptions;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    // when no disease is found on search by id
    // @ExceptionHandler(NoSuchElementException.class)
    // private ResponseEntity<Object> handleNoElementFound(NoSuchElementException
    // ex, WebRequest request) {
    // ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
    // ex.getLocalizedMessage(),
    // HttpStatus.BAD_REQUEST, request.getDescription(false));
    // return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);

    // }

    @ExceptionHandler(ApiException.class)
    private ResponseEntity<Object> handleApiException(ApiException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), ex.getLocalizedMessage(),
                HttpStatus.BAD_REQUEST, request.getDescription(false));
        return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
    }

}
