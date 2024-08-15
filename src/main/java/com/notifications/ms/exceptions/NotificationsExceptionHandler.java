package com.notifications.ms.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class NotificationsExceptionHandler {

    @ExceptionHandler(EmailNotSentException.class)
    public ResponseEntity<String> handleEmailNotSentException(EmailNotSentException e) {
        log.error(
                "{}{}",
                "Business Exception ",
                e.getMessage()
        );
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
