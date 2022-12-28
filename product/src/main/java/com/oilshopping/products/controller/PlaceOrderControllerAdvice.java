package com.oilshopping.products.controller;

import com.oilshopping.products.response.ErrorResponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PlaceOrderControllerAdvice {

    @ExceptionHandler()
    public ResponseEntity<Object> resourceNotFoundException(DataIntegrityViolationException ex) {

        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TransactionSystemException.class)
    public ResponseEntity<ErrorResponse> handleConstraintViolationException(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse(400, "Value must not be empty.", ex.getLocalizedMessage() );

        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }

}
