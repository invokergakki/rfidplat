package com.iking.consumer.Vo;

public class LoginRespVo {
    private int code;

    private String message;

    private LoginDataRespVo data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoginDataRespVo getData() {
        return data;
    }

    public void setData(LoginDataRespVo data) {
        this.data = data;
    }
}
