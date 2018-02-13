package com.primal;

public class Route {

    public static final String DOWM_NO_BUCKET = "111111110";
    public static final String DOWM_WITH_BUCKET = "111111111";

    private int routeId;
    private String routeName;
    private int destinationId;
    private int rateplanId;
    private int mediaGroup;
    private String startTime;
    private String endTime;
    private String dowm;
    private int interval1;
    private int interval2;
    private int interval3;
    private int cpi1;
    private int cpi2;
    private int cpi3;
    private int min1;
    private int min2;
    private int min3;
    private int max1;
    private int max2;
    private int max3;
    private int status;
    private int ratePlanType;
    private int originalRatePlan;
    private int parentRouteId;

    public Route() {
        this.routeId = 0;
        this.routeName = "";
        this.destinationId = 0;
        this.rateplanId = 0;
        this.mediaGroup = 0;
        this.startTime = "00:00:00";
        this.endTime = "23:59:59";
        this.dowm = DOWM_NO_BUCKET;
        this.interval1 = 60;
        this.interval2 = 0;
        this.interval3 = 0;
        this.cpi1 = 0;
        this.cpi2 = 0;
        this.cpi3 = 0;
        this.min1 = 0;
        this.min2 = 0;
        this.min3 = 0;
        this.max1 = 0;
        this.max2 = 0;
        this.max3 = 0;
        this.status = 1;
        this.ratePlanType = 0;
        this.originalRatePlan = 0;
        this.parentRouteId = 0;
    }

    public Route(int routeId, String routeName, int destinationId, int rateplanId, int mediaGroup, String startTime, String endTime, String dowm, int interval1, int interval2, int interval3, int cpi1, int cpi2, int cpi3, int min1, int min2, int min3, int max1, int max2, int max3, int status, int ratePlanType, int originalRatePlan, int parentRouteId) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.destinationId = destinationId;
        this.rateplanId = rateplanId;
        this.mediaGroup = mediaGroup;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dowm = dowm;
        this.interval1 = interval1;
        this.interval2 = interval2;
        this.interval3 = interval3;
        this.cpi1 = cpi1;
        this.cpi2 = cpi2;
        this.cpi3 = cpi3;
        this.min1 = min1;
        this.min2 = min2;
        this.min3 = min3;
        this.max1 = max1;
        this.max2 = max2;
        this.max3 = max3;
        this.status = status;
        this.ratePlanType = ratePlanType;
        this.originalRatePlan = originalRatePlan;
        this.parentRouteId = parentRouteId;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getRateplanId() {
        return rateplanId;
    }

    public void setRateplanId(int rateplanId) {
        this.rateplanId = rateplanId;
    }

    public int getMediaGroup() {
        return mediaGroup;
    }

    public void setMediaGroup(int mediaGroup) {
        this.mediaGroup = mediaGroup;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDowm() {
        return dowm;
    }

    public void setDowm(String dowm) {
        this.dowm = dowm;
    }

    public int getInterval1() {
        return interval1;
    }

    public void setInterval1(int interval1) {
        this.interval1 = interval1;
    }

    public int getInterval2() {
        return interval2;
    }

    public void setInterval2(int interval2) {
        this.interval2 = interval2;
    }

    public int getInterval3() {
        return interval3;
    }

    public void setInterval3(int interval3) {
        this.interval3 = interval3;
    }

    public int getCpi1() {
        return cpi1;
    }

    public void setCpi1(int cpi1) {
        this.cpi1 = cpi1;
    }

    public int getCpi2() {
        return cpi2;
    }

    public void setCpi2(int cpi2) {
        this.cpi2 = cpi2;
    }

    public int getCpi3() {
        return cpi3;
    }

    public void setCpi3(int cpi3) {
        this.cpi3 = cpi3;
    }

    public int getMin1() {
        return min1;
    }

    public void setMin1(int min1) {
        this.min1 = min1;
    }

    public int getMin2() {
        return min2;
    }

    public void setMin2(int min2) {
        this.min2 = min2;
    }

    public int getMin3() {
        return min3;
    }

    public void setMin3(int min3) {
        this.min3 = min3;
    }

    public int getMax1() {
        return max1;
    }

    public void setMax1(int max1) {
        this.max1 = max1;
    }

    public int getMax2() {
        return max2;
    }

    public void setMax2(int max2) {
        this.max2 = max2;
    }

    public int getMax3() {
        return max3;
    }

    public void setMax3(int max3) {
        this.max3 = max3;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRatePlanType() {
        return ratePlanType;
    }

    public void setRatePlanType(int ratePlanType) {
        this.ratePlanType = ratePlanType;
    }

    public int getOriginalRatePlan() {
        return originalRatePlan;
    }

    public void setOriginalRatePlan(int originalRatePlan) {
        this.originalRatePlan = originalRatePlan;
    }

    public int getParentRouteId() {
        return parentRouteId;
    }

    public void setParentRouteId(int parentRouteId) {
        this.parentRouteId = parentRouteId;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeId=" + routeId +
                ", routeName='" + routeName + '\'' +
                ", destinationId=" + destinationId +
                ", rateplanId=" + rateplanId +
                ", mediaGroup=" + mediaGroup +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", dowm='" + dowm + '\'' +
                ", interval1=" + interval1 +
                ", interval2=" + interval2 +
                ", interval3=" + interval3 +
                ", cpi1=" + cpi1 +
                ", cpi2=" + cpi2 +
                ", cpi3=" + cpi3 +
                ", min1=" + min1 +
                ", min2=" + min2 +
                ", min3=" + min3 +
                ", max1=" + max1 +
                ", max2=" + max2 +
                ", max3=" + max3 +
                ", status=" + status +
                ", ratePlanType=" + ratePlanType +
                ", originalRatePlan=" + originalRatePlan +
                ", parentRouteId=" + parentRouteId +
                '}';
    }
}
