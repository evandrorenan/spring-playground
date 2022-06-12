package com.evandrorenan.springplayground.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evandrorenan.springplayground.controller.dto.MessageDto;
import com.evandrorenan.springplayground.model.Message;
import com.evandrorenan.springplayground.model.User;
import com.evandrorenan.springplayground.service.IChatService;

@RestController
public class ChatController {

	@Autowired
	IChatService service;
	
	@GetMapping("/chat/{sender}/{intendedRecipient}")
	public List<Message> getChat(@PathVariable("sender") String sender, @PathVariable("intendedRecipient") String intendedRecipient) {
		return service.getChat(sender, intendedRecipient);
	}
	
	@GetMapping("/user/{password}")
	public User getUserByPassword(@PathVariable("password") String password) {
		return service.getUserByPassword(password);
	}
	
	@PostMapping("/message")
	public List<Message> postMessage(
		@RequestBody MessageDto messageDto) {
		
		System.out.println(messageDto.toString());
		service.postMessage(messageDto);
		return service.getChat(messageDto.getSender(), messageDto.getIntendedRecipient());
	}
}
