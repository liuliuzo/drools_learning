package com.liuliu.learning.drools.fusion.model;

import java.util.Date;

public final class OnlineEvent extends Event {

	private Date timestamp;
	private String message;

	public OnlineEvent(Date timestamp, String message) {
		super();
		this.timestamp = timestamp;
		this.message = message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}
}