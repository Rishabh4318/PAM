package com.digicore.preauth_payment;

import java.io.Serializable;

public class ResponseData implements Serializable{

    private String channel;

    private String requestType;

    private String productCode;

    private String agent;

    private Object details;

    private Object status;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "channel='" + channel + '\'' +
                ", requestType='" + requestType + '\'' +
                ", productCode='" + productCode + '\'' +
                ", agent='" + agent + '\'' +
                ", details=" + details +
                ", status=" + status +
                '}';
    }
}
