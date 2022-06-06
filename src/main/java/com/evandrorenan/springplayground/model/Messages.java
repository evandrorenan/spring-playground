package com.evandrorenan.springplayground.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Messages {

	private String sender = "";
	private String content = "";
	private String time = "";
}
