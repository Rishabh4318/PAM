package com.digicore.preauth_payment;

import java.io.Serializable;
import java.util.Objects;


public class Error implements Serializable{

	private String code;

	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Error other = (Error) obj;
		return Objects.equals(code, other.code) && Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
		return "{code=" + code + ", message=" + message + "}";
	}
}
