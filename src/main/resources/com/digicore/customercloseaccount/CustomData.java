package com.digicore.preauth_payment;



import java.io.Serializable;


public class CustomData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String requestType;

    private Object details;

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

    @Override
    public String toString() {
        return "CustomData{" +
                "requestType=" + requestType +
                ",details=" + details +
                '}';
    }
}
