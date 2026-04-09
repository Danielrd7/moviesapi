package com.danielrd7.moviesApi.advice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.danielrd7.moviesApi.Exeption.DuplicatedItemExeption;
import com.danielrd7.moviesApi.Exeption.ItemNotFoundExeption;

@ControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(ItemNotFoundExeption.class)
    public ResponseEntity<Object> handleItemNotFound(final ItemNotFoundExeption infe) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", infe.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    @ExceptionHandler(DuplicatedItemExeption.class)
    public ResponseEntity<Object> handleDuplicatedItem(final DuplicatedItemExeption die) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", die.getMessage());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
    }
}