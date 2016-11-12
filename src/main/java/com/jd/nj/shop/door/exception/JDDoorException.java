package com.jd.nj.shop.door.exception;

public class JDDoorException extends Exception {
	private static final long serialVersionUID = -2751639480952381856L;

	/**
	 * 错误编码
	 */
	private String code;

	public JDDoorException(String code, String message) {
		super(message);
		this.code = code;
	}

	public JDDoorException(String code, String message, Throwable source) {
		super(message, source);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
