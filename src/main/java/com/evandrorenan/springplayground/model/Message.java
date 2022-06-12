package com.evandrorenan.springplayground.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Message {

	private String content;
	private String sender;
	private String password;
	private String intendedRecipient;
	@Getter(value = AccessLevel.NONE)
	private Long messageTime = 0L;
	private Integer messageNumber = 0;
	
	public String getMessageTime() {
		Date date=new Date(this.messageTime);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM HH:mm");
        return sdf.format(date);
	}
}