package com.primal;

public class AccountActivitySummary {
    private String accountId;
    private String billingId;
    private String mdn;
    private String mdn2;
    private String msid;
    private String esn;
    private int cdr;
    private int airTime;
    private int airTimeBilled;
    private int revence;
    private int adjustment;
    private int prepaidRecharge;
    private int creditRecharge;
    private int expiredBalance;
    private String lastCall;
    private int lastBalance;
    private int startingBalance;
    private String activationDate;
    private String expiryDate;
    private String template;
    private int rateplanId;
    private int status;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBillingId() {
        return billingId;
    }

    public void setBillingId(String billingId) {
        this.billingId = billingId;
    }

    public String getMdn() {
        return mdn;
    }

    public void setMdn(String mdn) {
        this.mdn = mdn;
    }

    public String getMdn2() {
        return mdn2;
    }

    public void setMdn2(String mdn2) {
        this.mdn2 = mdn2;
    }

    public String getMsid() {
        return msid;
    }

    public void setMsid(String msid) {
        this.msid = msid;
    }

    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public int getCdr() {
        return cdr;
    }

    public void setCdr(int cdr) {
        this.cdr = cdr;
    }

    public int getAirTime() {
        return airTime;
    }

    public void setAirTime(int airTime) {
        this.airTime = airTime;
    }

    public int getAirTimeBilled() {
        return airTimeBilled;
    }

    public void setAirTimeBilled(int airTimeBilled) {
        this.airTimeBilled = airTimeBilled;
    }

    public int getRevence() {
        return revence;
    }

    public void setRevence(int revence) {
        this.revence = revence;
    }

    public int getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(int adjustment) {
        this.adjustment = adjustment;
    }

    public int getPrepaidRecharge() {
        return prepaidRecharge;
    }

    public void setPrepaidRecharge(int prepaidRecharge) {
        this.prepaidRecharge = prepaidRecharge;
    }

    public int getCreditRecharge() {
        return creditRecharge;
    }

    public void setCreditRecharge(int creditRecharge) {
        this.creditRecharge = creditRecharge;
    }

    public int getExpiredBalance() {
        return expiredBalance;
    }

    public void setExpiredBalance(int expiredBalance) {
        this.expiredBalance = expiredBalance;
    }

    public String getLastCall() {
        return lastCall;
    }

    public void setLastCall(String lastCall) {
        this.lastCall = lastCall;
    }

    public int getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(int lastBalance) {
        this.lastBalance = lastBalance;
    }

    public int getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(int startingBalance) {
        this.startingBalance = startingBalance;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public int getRateplanId() {
        return rateplanId;
    }

    public void setRateplanId(int rateplanId) {
        this.rateplanId = rateplanId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AccountActivitySummary{" +
                "accountId='" + accountId + '\'' +
                ", billingId='" + billingId + '\'' +
                ", mdn='" + mdn + '\'' +
                ", mdn2='" + mdn2 + '\'' +
                ", msid='" + msid + '\'' +
                ", esn='" + esn + '\'' +
                ", cdr=" + cdr +
                ", airTime=" + airTime +
                ", airTimeBilled=" + airTimeBilled +
                ", revence=" + revence +
                ", adjustment=" + adjustment +
                ", prepaidRecharge=" + prepaidRecharge +
                ", creditRecharge=" + creditRecharge +
                ", expiredBalance=" + expiredBalance +
                ", lastCall='" + lastCall + '\'' +
                ", lastBalance=" + lastBalance +
                ", startingBalance=" + startingBalance +
                ", activationDate='" + activationDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", template='" + template + '\'' +
                ", rateplanId=" + rateplanId +
                ", status=" + status +
                '}';
    }
}
