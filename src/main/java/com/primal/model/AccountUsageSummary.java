package com.primal.model;

public class AccountUsageSummary implements Cloneable {
    private String accountId = "";
    private String mdn = "";
    private String msid = "";
    private String billingId = "";
    private String template = "";
    private String postalCode = "";
    private int callsIn = 0;
    private int timesIn = 0;
    private int timesInBilled = 0;
    private int costsIn = 0;
    private int callsOut = 0;
    private int timesOut = 0;
    private int timesOutBilled = 0;
    private int costsOut = 0;
    private int callsLD = 0;
    private int timesLD = 0;
    private int timesLDBilled = 0;
    private int costsLD = 0;
    private int callsOversea = 0;
    private int timesOversea = 0;
    private int timesOverseaBilled = 0;
    private int costsOversea = 0;
    private int callsVMDeposit = 0;
    private int timesVMDeposit = 0;
    private int costsVMDeposit = 0;
    private int callsVMRetrieval = 0;
    private int timesVMRetrieval = 0;
    private int timesVMRetrievalBilled = 0;
    private int costsVMRetrieval = 0;
    private int callsRoaming = 0;
    private int timesRoaming = 0;
    private int timesRoamingBilled = 0;
    private int costsRoaming = 0;
    private int numSMSSent = 0;
    private int costsSMSSent = 0;
    private int numSMSReceived = 0;
    private int costsSMSReceived = 0;
    private int numMMSSent = 0;//sw+ MMS 20090807
    private int costsMMSSent = 0;
    private int numMMSReceived = 0;
    private int costsMMSReceived = 0;
    private int costsWAPSetup = 0;
    private int costsWAPDaily  = 0;
    private int costsDownload  = 0;
    private int costsUpload = 0;
    private String lastCall = "";
    private int totalTimes = 0;
    private int totalTimesBilled = 0;
    private int totalCosts = 0;
    private int monthlyFee = 0;
    private int e911Fee = 0;//v11.08 201111
    private int kbData = 0;//v1.0.5
    private int ratePlanID = 0; //v1.0.8
    private int carrierID = 0; //v1.0.10

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMdn() {
        return mdn;
    }

    public void setMdn(String mdn) {
        this.mdn = mdn;
    }

    public String getMsid() {
        return msid;
    }

    public void setMsid(String msid) {
        this.msid = msid;
    }

    public String getBillingId() {
        return billingId;
    }

    public void setBillingId(String billingId) {
        this.billingId = billingId;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getCallsIn() {
        return callsIn;
    }

    public void setCallsIn(int callsIn) {
        this.callsIn = callsIn;
    }

    public int getTimesIn() {
        return timesIn;
    }

    public void setTimesIn(int timesIn) {
        this.timesIn = timesIn;
    }

    public int getTimesInBilled() {
        return timesInBilled;
    }

    public void setTimesInBilled(int timesInBilled) {
        this.timesInBilled = timesInBilled;
    }

    public int getCostsIn() {
        return costsIn;
    }

    public void setCostsIn(int costsIn) {
        this.costsIn = costsIn;
    }

    public int getCallsOut() {
        return callsOut;
    }

    public void setCallsOut(int callsOut) {
        this.callsOut = callsOut;
    }

    public int getTimesOut() {
        return timesOut;
    }

    public void setTimesOut(int timesOut) {
        this.timesOut = timesOut;
    }

    public int getTimesOutBilled() {
        return timesOutBilled;
    }

    public void setTimesOutBilled(int timesOutBilled) {
        this.timesOutBilled = timesOutBilled;
    }

    public int getCostsOut() {
        return costsOut;
    }

    public void setCostsOut(int costsOut) {
        this.costsOut = costsOut;
    }

    public int getCallsLD() {
        return callsLD;
    }

    public void setCallsLD(int callsLD) {
        this.callsLD = callsLD;
    }

    public int getTimesLD() {
        return timesLD;
    }

    public void setTimesLD(int timesLD) {
        this.timesLD = timesLD;
    }

    public int getTimesLDBilled() {
        return timesLDBilled;
    }

    public void setTimesLDBilled(int timesLDBilled) {
        this.timesLDBilled = timesLDBilled;
    }

    public int getCostsLD() {
        return costsLD;
    }

    public void setCostsLD(int costsLD) {
        this.costsLD = costsLD;
    }

    public int getCallsOversea() {
        return callsOversea;
    }

    public void setCallsOversea(int callsOversea) {
        this.callsOversea = callsOversea;
    }

    public int getTimesOversea() {
        return timesOversea;
    }

    public void setTimesOversea(int timesOversea) {
        this.timesOversea = timesOversea;
    }

    public int getTimesOverseaBilled() {
        return timesOverseaBilled;
    }

    public void setTimesOverseaBilled(int timesOverseaBilled) {
        this.timesOverseaBilled = timesOverseaBilled;
    }

    public int getCostsOversea() {
        return costsOversea;
    }

    public void setCostsOversea(int costsOversea) {
        this.costsOversea = costsOversea;
    }

    public int getCallsVMDeposit() {
        return callsVMDeposit;
    }

    public void setCallsVMDeposit(int callsVMDeposit) {
        this.callsVMDeposit = callsVMDeposit;
    }

    public int getTimesVMDeposit() {
        return timesVMDeposit;
    }

    public void setTimesVMDeposit(int timesVMDeposit) {
        this.timesVMDeposit = timesVMDeposit;
    }

    public int getCostsVMDeposit() {
        return costsVMDeposit;
    }

    public void setCostsVMDeposit(int costsVMDeposit) {
        this.costsVMDeposit = costsVMDeposit;
    }

    public int getCallsVMRetrieval() {
        return callsVMRetrieval;
    }

    public void setCallsVMRetrieval(int callsVMRetrieval) {
        this.callsVMRetrieval = callsVMRetrieval;
    }

    public int getTimesVMRetrieval() {
        return timesVMRetrieval;
    }

    public void setTimesVMRetrieval(int timesVMRetrieval) {
        this.timesVMRetrieval = timesVMRetrieval;
    }

    public int getTimesVMRetrievalBilled() {
        return timesVMRetrievalBilled;
    }

    public void setTimesVMRetrievalBilled(int timesVMRetrievalBilled) {
        this.timesVMRetrievalBilled = timesVMRetrievalBilled;
    }

    public int getCostsVMRetrieval() {
        return costsVMRetrieval;
    }

    public void setCostsVMRetrieval(int costsVMRetrieval) {
        this.costsVMRetrieval = costsVMRetrieval;
    }

    public int getCallsRoaming() {
        return callsRoaming;
    }

    public void setCallsRoaming(int callsRoaming) {
        this.callsRoaming = callsRoaming;
    }

    public int getTimesRoaming() {
        return timesRoaming;
    }

    public void setTimesRoaming(int timesRoaming) {
        this.timesRoaming = timesRoaming;
    }

    public int getTimesRoamingBilled() {
        return timesRoamingBilled;
    }

    public void setTimesRoamingBilled(int timesRoamingBilled) {
        this.timesRoamingBilled = timesRoamingBilled;
    }

    public int getCostsRoaming() {
        return costsRoaming;
    }

    public void setCostsRoaming(int costsRoaming) {
        this.costsRoaming = costsRoaming;
    }

    public int getNumSMSSent() {
        return numSMSSent;
    }

    public void setNumSMSSent(int numSMSSent) {
        this.numSMSSent = numSMSSent;
    }

    public int getCostsSMSSent() {
        return costsSMSSent;
    }

    public void setCostsSMSSent(int costsSMSSent) {
        this.costsSMSSent = costsSMSSent;
    }

    public int getNumSMSReceived() {
        return numSMSReceived;
    }

    public void setNumSMSReceived(int numSMSReceived) {
        this.numSMSReceived = numSMSReceived;
    }

    public int getCostsSMSReceived() {
        return costsSMSReceived;
    }

    public void setCostsSMSReceived(int costsSMSReceived) {
        this.costsSMSReceived = costsSMSReceived;
    }

    public int getNumMMSSent() {
        return numMMSSent;
    }

    public void setNumMMSSent(int numMMSSent) {
        this.numMMSSent = numMMSSent;
    }

    public int getCostsMMSSent() {
        return costsMMSSent;
    }

    public void setCostsMMSSent(int costsMMSSent) {
        this.costsMMSSent = costsMMSSent;
    }

    public int getNumMMSReceived() {
        return numMMSReceived;
    }

    public void setNumMMSReceived(int numMMSReceived) {
        this.numMMSReceived = numMMSReceived;
    }

    public int getCostsMMSReceived() {
        return costsMMSReceived;
    }

    public void setCostsMMSReceived(int costsMMSReceived) {
        this.costsMMSReceived = costsMMSReceived;
    }

    public int getCostsWAPSetup() {
        return costsWAPSetup;
    }

    public void setCostsWAPSetup(int costsWAPSetup) {
        this.costsWAPSetup = costsWAPSetup;
    }

    public int getCostsWAPDaily() {
        return costsWAPDaily;
    }

    public void setCostsWAPDaily(int costsWAPDaily) {
        this.costsWAPDaily = costsWAPDaily;
    }

    public int getCostsDownload() {
        return costsDownload;
    }

    public void setCostsDownload(int costsDownload) {
        this.costsDownload = costsDownload;
    }

    public int getCostsUpload() {
        return costsUpload;
    }

    public void setCostsUpload(int costsUpload) {
        this.costsUpload = costsUpload;
    }

    public String getLastCall() {
        return lastCall;
    }

    public void setLastCall(String lastCall) {
        this.lastCall = lastCall;
    }

    public int getTotalTimes() {
        return totalTimes;
    }

    public void setTotalTimes(int totalTimes) {
        this.totalTimes = totalTimes;
    }

    public int getTotalTimesBilled() {
        return totalTimesBilled;
    }

    public void setTotalTimesBilled(int totalTimesBilled) {
        this.totalTimesBilled = totalTimesBilled;
    }

    public int getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(int totalCosts) {
        this.totalCosts = totalCosts;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getE911Fee() {
        return e911Fee;
    }

    public void setE911Fee(int e911Fee) {
        this.e911Fee = e911Fee;
    }

    public int getKbData() {
        return kbData;
    }

    public void setKbData(int kbData) {
        this.kbData = kbData;
    }

    public int getRatePlanID() {
        return ratePlanID;
    }

    public void setRatePlanID(int ratePlanID) {
        this.ratePlanID = ratePlanID;
    }

    public int getCarrierID() {
        return carrierID;
    }

    public void setCarrierID(int carrierID) {
        this.carrierID = carrierID;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "AccountUsageSummary{" +
                "accountId='" + accountId + '\'' +
                ", mdn='" + mdn + '\'' +
                ", msid='" + msid + '\'' +
                ", billingId='" + billingId + '\'' +
                ", template='" + template + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", callsIn=" + callsIn +
                ", timesIn=" + timesIn +
                ", timesInBilled=" + timesInBilled +
                ", costsIn=" + costsIn +
                ", callsOut=" + callsOut +
                ", timesOut=" + timesOut +
                ", timesOutBilled=" + timesOutBilled +
                ", costsOut=" + costsOut +
                ", callsLD=" + callsLD +
                ", timesLD=" + timesLD +
                ", timesLDBilled=" + timesLDBilled +
                ", costsLD=" + costsLD +
                ", callsOversea=" + callsOversea +
                ", timesOversea=" + timesOversea +
                ", timesOverseaBilled=" + timesOverseaBilled +
                ", costsOversea=" + costsOversea +
                ", callsVMDeposit=" + callsVMDeposit +
                ", timesVMDeposit=" + timesVMDeposit +
                ", costsVMDeposit=" + costsVMDeposit +
                ", callsVMRetrieval=" + callsVMRetrieval +
                ", timesVMRetrieval=" + timesVMRetrieval +
                ", timesVMRetrievalBilled=" + timesVMRetrievalBilled +
                ", costsVMRetrieval=" + costsVMRetrieval +
                ", callsRoaming=" + callsRoaming +
                ", timesRoaming=" + timesRoaming +
                ", timesRoamingBilled=" + timesRoamingBilled +
                ", costsRoaming=" + costsRoaming +
                ", numSMSSent=" + numSMSSent +
                ", costsSMSSent=" + costsSMSSent +
                ", numSMSReceived=" + numSMSReceived +
                ", costsSMSReceived=" + costsSMSReceived +
                ", numMMSSent=" + numMMSSent +
                ", costsMMSSent=" + costsMMSSent +
                ", numMMSReceived=" + numMMSReceived +
                ", costsMMSReceived=" + costsMMSReceived +
                ", costsWAPSetup=" + costsWAPSetup +
                ", costsWAPDaily=" + costsWAPDaily +
                ", costsDownload=" + costsDownload +
                ", costsUpload=" + costsUpload +
                ", lastCall='" + lastCall + '\'' +
                ", totalTimes=" + totalTimes +
                ", totalTimesBilled=" + totalTimesBilled +
                ", totalCosts=" + totalCosts +
                ", monthlyFee=" + monthlyFee +
                ", e911Fee=" + e911Fee +
                ", kbData=" + kbData +
                ", ratePlanID=" + ratePlanID +
                ", carrierID=" + carrierID +
                '}';
    }
}
