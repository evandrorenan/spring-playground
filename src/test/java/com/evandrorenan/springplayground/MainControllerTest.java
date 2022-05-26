package com.evandrorenan.springplayground;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainControllerTest {

	@Test
	void whenCallingHello_thenReturnHello() {
		MainController mainController = new MainController();
		String result = mainController.getHello();
		assertTrue(result.contains("Hello"));
	}
}
