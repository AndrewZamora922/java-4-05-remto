package com.company.entity;

public class messageEntity {

    private String message;
    private String title;
    private boolean isRead;

    public messageEntity(String message, String title) {
        this.message = message;
        this.title = title;
        this.isRead = isRead;
    }

    public messageEntity() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
