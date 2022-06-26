package com.example.keycloaksso.exception;

import com.example.keycloaksso.model.BaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * author CuongLM
 */
@RestControllerAdvice
@AllArgsConstructor
public class ExceptionHandlerCtr {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<BaseResponse<StatusResponse>> handlerBusinessException(BusinessException businessException) {
        return new ResponseEntity<>(BaseResponse.ofFail(businessException), businessException.getStatusResponse().getStatus());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<BaseResponse<StatusResponse>> handlerAccessDenidedException(AccessDeniedException accessDeniedException) {
        return new ResponseEntity<>(BaseResponse.ofFail(accessDeniedException), HttpStatus.FORBIDDEN);
    }
}
