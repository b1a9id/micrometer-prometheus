package com.b1a9idps.micrometerprometheus.response;

public record IndexResponse(String message) {

    public String getMessage() {
        return message;
    }
}
