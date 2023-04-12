package com.example.android.quakereport;

public class Earthquake {
    private String mLocation;
    private long mTimeinmilliseconds;
    private double mMagnitude;
    private String murl;
    public Earthquake(double mag, String place, long date, String url) {
        mMagnitude = mag;
        mLocation = place;
        mTimeinmilliseconds = date;
        murl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmDate() {
        return mTimeinmilliseconds;
    }

    public String getMurl() { return murl; }
}
