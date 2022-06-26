package com.example.keycloaksso.model;

import com.example.keycloaksso.exception.BusinessException;
import com.example.keycloaksso.exception.StatusResponse;
import com.example.keycloaksso.exception.StatusTemplate;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * author cuonglm18
 */
@Getter
@Setter
public class BaseResponse<T> {

    private HttpStatus code;
    private T data;

    public BaseResponse(HttpStatus code, T data) {
        this.code = code;
        this.data = data;
    }

    public static <M> BaseResponse ofSuccess(M data) {
        return new BaseResponse<>(HttpStatus.OK, data);
    }

    public static BaseResponse<StatusResponse> ofFail(BusinessException businessException) {
        return new BaseResponse<>(businessException.getStatusResponse().getStatus(), businessException.getStatusResponse());
    }

    public static BaseResponse<StatusResponse> ofFail(AccessDeniedException accessDeniedException) {
        return new BaseResponse<>(HttpStatus.FORBIDDEN, StatusTemplate.CRM_FORBIDDEN);
    }

}
