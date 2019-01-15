package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by Avaneesh Kumar on 02-01-2019.
 */

public class Earthquake {
    private Double mag;
    private String city;
    private long mTimeinMilliseconds;
    private String mUrl;

    public Earthquake(Double mag, String city, long mTimeinMilliseconds, String mUrl){
        this.mag = mag;
        this.city = city;
        this.mTimeinMilliseconds = mTimeinMilliseconds;
        this.mUrl = mUrl;
    }

    public Double getMag(){
        return mag;
    }

    public String getCity(){
        return city;
    }

    public long getmTimeinMilliseconds() {
        return mTimeinMilliseconds;
    }

    public String getmUrl(){return mUrl;}
}
