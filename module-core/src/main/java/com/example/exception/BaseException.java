package com.example.exception;

import com.example.response.status.ResponseStatus;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final ResponseStatus exceptionStatus;


    public BaseException(ResponseStatus exceptionStatus) {
        super(exceptionStatus.getMessage());
        this.exceptionStatus = exceptionStatus;
    }

    public BaseException(String exceptionMessage, ResponseStatus exceptionStatus) {
        super(exceptionMessage);
        this.exceptionStatus = exceptionStatus;
    }
}