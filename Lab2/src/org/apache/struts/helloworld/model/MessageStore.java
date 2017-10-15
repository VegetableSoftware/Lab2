package org.apache.struts.helloworld.model;

public class MessageStore {
	private String message;
	public MessageStore() {
		setMessage("Hello, world!");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
