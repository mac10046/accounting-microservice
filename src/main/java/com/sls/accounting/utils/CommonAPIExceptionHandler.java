package com.sls.accounting.utils;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CommonAPIExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Reference https://stackoverflow.com/questions/50273906/how-to-improve-error-responses-when-using-repositoryrestresource
     * @param ex
     * @param req
     * @return
     */
    @ExceptionHandler(Exception.class)
    ResponseEntity<?> handleAnyException(Exception ex, HttpServletRequest req) {

        String causeMessage = NestedExceptionUtils.getMostSpecificCause(ex).getMessage(); // determine the root cause message
        String reqPath = req.getServletPath(); // get the request path
        System.err.println("API Error caused on " + reqPath + " : " + causeMessage);

        String userMessage = "...Something seems to have gone wrong, check the requested API or kindly try again later."; // Decide what the message you will show to users
        HttpStatus status = HttpStatus.SERVICE_UNAVAILABLE; // Decide what the status your response will be have, for example HttpStatus.CONFLICT
        return new ResponseEntity<>(userMessage, status); // return response to users
    }

    // other handlers
}
