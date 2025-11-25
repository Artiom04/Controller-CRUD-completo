package com.code.demo.dto;

public class EchoRequest{
    private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message ){
        this.message = message;
    }
}