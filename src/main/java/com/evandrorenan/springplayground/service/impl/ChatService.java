package com.evandrorenan.springplayground.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.evandrorenan.springplayground.controller.dto.MessageDto;
import com.evandrorenan.springplayground.model.Chat;
import com.evandrorenan.springplayground.model.Message;
import com.evandrorenan.springplayground.service.IChatService;

@Component
public class ChatService implements IChatService{

	@Autowired
	private Chat chat;
	
	@Override
	public Chat getChat() {
		return chat;
	}

	@Override
	public Message postMessage(MessageDto messageDto) {		
		Message message = toMessage(messageDto);
		
		message.setMessageTime(System.currentTimeMillis());
		message.setContent(message.getContent() + " - " + String.valueOf(System.currentTimeMillis()));
		this.chat.getMessages().add(message);
		return message;
	}

	private Message toMessage(MessageDto messageDto) {
		Message message = new Message(
				messageDto.getContent(), 
				messageDto.getSender(), 
				messageDto.getPassword(), 
				messageDto.getIntendedRecipient(), Long.valueOf(0L),
				this.chat.getMessages().size());
		return message;
	}
}