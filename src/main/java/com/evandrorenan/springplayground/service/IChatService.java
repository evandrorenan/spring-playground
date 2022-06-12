package com.evandrorenan.springplayground.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.evandrorenan.springplayground.controller.dto.MessageDto;
import com.evandrorenan.springplayground.model.Message;
import com.evandrorenan.springplayground.model.User;

@Component
public interface IChatService {

	List<Message> getChat(String sender, String intendedRecipient);

	Message postMessage(MessageDto messageDto);
	
	User getUserByPassword(String password);
}
