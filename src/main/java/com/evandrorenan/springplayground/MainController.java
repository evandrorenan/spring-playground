package com.evandrorenan.springplayground;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/hello")
	public String getHello()  {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return "Hello " + sdf.format(new Date(System.currentTimeMillis()));
	}

}
