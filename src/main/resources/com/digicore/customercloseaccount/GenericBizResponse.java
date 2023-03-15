package com.digicore.preauth_payment;

import java.io.Serializable;

public class GenericBizResponse implements Serializable{

    
    private ResponseData data;

    private Meta meta;
    
    private Error error;


    public ResponseData getData() {
        return data;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	@Override
    public String toString() {
        return "GenericBizResponse{" +
                "data=" + data +
                ", meta=" + meta +
                '}';
    }
}
