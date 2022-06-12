package com.evandrorenan.springplayground.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Chat {

	private List <Message> fifoMessageOld = new ArrayList<>();

	private LinkedHashMap<Long, Message> fifoMessages = new LinkedHashMap<Long, Message>() {
		private static final long serialVersionUID = -9216336325454712164L;

		@Override
		protected boolean removeEldestEntry(java.util.Map.Entry<Long, Message> eldest) {
			return size() > 1000;
		}
	};
}
