package com.example.keycloaksso.exception;

import org.springframework.http.HttpStatus;

/**
 * author CuongLM
 */
public interface StatusTemplate {

    StatusResponse CRM_FORBIDDEN =
            new StatusResponse("CRM-FORBIDDEN", "No access to api", HttpStatus.FORBIDDEN);
}
