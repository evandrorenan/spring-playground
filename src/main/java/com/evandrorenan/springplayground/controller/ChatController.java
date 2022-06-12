package com.evandrorenan.springplayground.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evandrorenan.springplayground.controller.dto.MessageDto;
import com.evandrorenan.springplayground.model.Chat;
import com.evandrorenan.springplayground.service.IChatService;

@RestController
public class ChatController {

	@Autowired
	IChatService service;
	
	@GetMapping("/chat")
	public Chat getChat() {
		return service.getChat();
	}
	
	@GetMapping("/example")
	public MessageDto example() {
		return new MessageDto("mensagem", "origem", "senha", "destino");
	}
	
	@PostMapping("/message")
	public Chat postMessage(
		@RequestBody MessageDto messageDto) {
		
		service.postMessage(messageDto);
		return service.getChat();
	}
}
