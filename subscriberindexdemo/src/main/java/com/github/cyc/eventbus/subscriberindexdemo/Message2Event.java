package com.github.cyc.eventbus.subscriberindexdemo;

public class Message2Event {
    private String message;

    public Message2Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
