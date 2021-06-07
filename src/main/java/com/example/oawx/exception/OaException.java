package com.example.oawx.exception;

import lombok.Data;

@Data
public class OaException extends RuntimeException{
    private String msg;
    private int code=500;

    public OaException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public OaException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public OaException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public OaException(String msg, int code, Throwable e) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

}
