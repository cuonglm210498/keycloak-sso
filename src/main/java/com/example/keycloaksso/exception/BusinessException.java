package com.example.keycloaksso.exception;

import lombok.Getter;
import org.springframework.security.access.AccessDeniedException;

/**
 * author CuongLM
 */
@Getter
public class BusinessException extends RuntimeException {

    private StatusResponse statusResponse;

    public BusinessException(StatusResponse statusResponse) {
        this.statusResponse = statusResponse;
    }
}
