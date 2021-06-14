package com.example.baitaplon.model;

public class User {
    private int mID;
    private String mUsername;
    private String mPassword;

    public User(String mUsername, String mPassword) {
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }

    public User(int mID, String mUsername, String mPassword) {
        this.mID = mID;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
}
