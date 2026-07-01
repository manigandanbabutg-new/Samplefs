package com.project.dto;

public class RequestDto {

    private String message;
 
    public RequestDto() {
    }

    public RequestDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
