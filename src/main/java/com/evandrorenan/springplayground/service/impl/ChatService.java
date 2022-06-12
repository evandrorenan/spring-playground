package com.evandrorenan.springplayground.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.evandrorenan.springplayground.controller.dto.MessageDto;
import com.evandrorenan.springplayground.model.Chat;
import com.evandrorenan.springplayground.model.Message;
import com.evandrorenan.springplayground.model.User;
import com.evandrorenan.springplayground.service.IChatService;

import lombok.Data;

@Component
@Data
public class ChatService implements IChatService{

	@Autowired
	private Chat chat;
	
	@Override
	public List<Message> getChat(String sender, String intendedRecipient) {
		
		return chat.getFifoMessages().values().stream()
			.filter(p -> 
					p.getSender().equals(sender) && p.getIntendedRecipient().equals(intendedRecipient)
				||	p.getSender().equals(intendedRecipient) && p.getIntendedRecipient().equals(sender))
			.collect(Collectors.toList());
			
	}

	@Override
	public Message postMessage(MessageDto messageDto) {		
		Message message = toMessage(messageDto);
		
		message.setMessageTime(System.currentTimeMillis());
		message.setContent(message.getContent());
		this.chat.getFifoMessages().put(System.currentTimeMillis(), message);
		return message;
	}

	@Override
	public User getUserByPassword(String password) {
		List<User> users = Arrays.asList(
			new User("Juh", "crush"),
			new User("Evandro", "owner"),
			new User("Camila", "amiga"));
		
		List<User> filteredUsers = users.stream()
			.filter(predicate -> predicate.getPassword().equals(password))
			.collect(Collectors.toList());
		
		if (filteredUsers.isEmpty()) {
			throw new IllegalArgumentException("Invalid password");
		}

		return filteredUsers.get(0);
	}

	private Message toMessage(MessageDto messageDto) {
		Message message = new Message(
				messageDto.getContent(), 
				messageDto.getSender(), 
				messageDto.getPassword(), 
				messageDto.getIntendedRecipient(), 
				Long.valueOf(0L),
				this.chat.getFifoMessages().size());
		return message;
	}
}