package com.evandrorenan.springplayground.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Chat {
	
	private List <Message> messages = new ArrayList<>();

}
