package com.digicore.preauth_payment;

import java.io.Serializable;


public class BizCustomRequest implements Serializable{

    private static final long serialVersionUID = 1L;

    private CustomData data;

    public CustomData getData() {
        return data;
    }

    public void setData(CustomData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BizCustomRequest{" +
                "data=" + data +
                '}';
    }
}
