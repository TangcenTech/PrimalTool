package com.primal;

import java.util.ArrayList;
import java.util.List;

public class RateTableFile {

    private String destinationName;
    private String routingCode;
    private String interval;
    private String rate;
    private String ratePlan13;
    private String ratePlan14;
    private String ratePlan15;
    private String ratePlan16;


    public RateTableFile() {
        this.destinationName = "";
        this.routingCode = "";
        this.interval = "";
        this.rate = "";
        this.ratePlan13 = "";
        this.ratePlan14 = "";
        this.ratePlan15 = "";
        this.ratePlan16 = "";
    }

    public RateTableFile(String destinationName, String routingCode, String interval, String rate, String ratePlan13, String ratePlan14, String ratePlan15, String ratePlan16) {
        this.destinationName = destinationName;
        this.routingCode = routingCode;
        this.interval = interval;
        this.rate = rate;
        this.ratePlan13 = ratePlan13;
        this.ratePlan14 = ratePlan14;
        this.ratePlan15 = ratePlan15;
        this.ratePlan16 = ratePlan16;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getRoutingCode() {
        return routingCode;
    }

    public void setRoutingCode(String routingCode) {
        this.routingCode = routingCode;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRatePlan13() {
        return ratePlan13;
    }

    public void setRatePlan13(String ratePlan13) {
        this.ratePlan13 = ratePlan13;
    }

    public String getRatePlan14() {
        return ratePlan14;
    }

    public void setRatePlan14(String ratePlan14) {
        this.ratePlan14 = ratePlan14;
    }

    public String getRatePlan15() {
        return ratePlan15;
    }

    public void setRatePlan15(String ratePlan15) {
        this.ratePlan15 = ratePlan15;
    }

    public String getRatePlan16() {
        return ratePlan16;
    }

    public void setRatePlan16(String ratePlan16) {
        this.ratePlan16 = ratePlan16;
    }

    @Override
    public String toString() {
        return "RateTableFile{" +
                "destinationName='" + destinationName + '\'' +
                ", routingCode='" + routingCode + '\'' +
                ", interval='" + interval + '\'' +
                ", rate='" + rate + '\'' +
                ", ratePlan13='" + ratePlan13 + '\'' +
                ", ratePlan14='" + ratePlan14 + '\'' +
                ", ratePlan15='" + ratePlan15 + '\'' +
                ", ratePlan16='" + ratePlan16 + '\'' +
                '}';
    }
}
