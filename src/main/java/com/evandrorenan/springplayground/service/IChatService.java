package com.evandrorenan.springplayground.service;

import org.springframework.stereotype.Component;

import com.evandrorenan.springplayground.controller.dto.MessageDto;
import com.evandrorenan.springplayground.model.Chat;
import com.evandrorenan.springplayground.model.Message;

@Component
public interface IChatService {

	Chat getChat();

	Message postMessage(MessageDto messageDto);

}
