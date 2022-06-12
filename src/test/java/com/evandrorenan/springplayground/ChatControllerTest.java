package com.evandrorenan.springplayground;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.evandrorenan.springplayground.controller.ChatController;

class ChatControllerTest {

	ChatController chatController = new ChatController();

	@Test
	void whenMessagesRequested_sendMessages() {
		assertTrue(true);
	}

}
