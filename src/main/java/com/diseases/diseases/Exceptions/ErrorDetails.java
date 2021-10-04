package com.diseases.diseases.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorDetails {

    private LocalDateTime timestamp;

    private String error;

    private HttpStatus status;

    private String url;

    public ErrorDetails(LocalDateTime localDateTime, String error, HttpStatus status, String url) {
        this.timestamp = localDateTime;
        this.error = error;
        this.status = status;
        this.url = url;

    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getError() {
        return error;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getUrl() {
        return url;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
