package com.example.codingevents.models;

public enum EventType {

    CONFERENCE("Conference"),
    MEETUP("Meetup"),
    WORKSHOP("Workshop"),
    SOCIAL("Social");

    EventType(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }

    private final String displayName;


}
