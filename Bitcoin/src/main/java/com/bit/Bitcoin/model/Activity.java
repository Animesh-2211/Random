package com.bit.Bitcoin.model;

public class Activity {
    private String activity;
    private String type;
    private int participants;

    // Constructors, Getters, and Setters

    public Activity() {
    }

    public Activity(String activity, String type, int participants) {
        this.activity = activity;
        this.type = type;
        this.participants = participants;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }
}
