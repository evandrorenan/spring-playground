package com.evandrorenan.springplayground.controller.dto;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class MessageDto implements Serializable {
	private static final long serialVersionUID = -6039632585633628090L;
	private String content;
	private String sender;
	private String password;
	private String intendedRecipient;
	
	/*
	public MessageDto(String content, String sender, String password, String intendedRecipient) {
		super();
		this.content = content;
		this.sender = sender;
		this.password = password;
		this.intendedRecipient = intendedRecipient;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIntendedRecipient() {
		return intendedRecipient;
	}

	public void setIntendedRecipient(String intendedRecipient) {
		this.intendedRecipient = intendedRecipient;
	}
	
	
	*/
}
