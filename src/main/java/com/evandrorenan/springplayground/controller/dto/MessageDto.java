package com.evandrorenan.springplayground.controller.dto;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class MessageDto implements Serializable {
	private static final long serialVersionUID = -6039632585633628090L;
	private String content;
	private String sender;
	private String password;
	private String intendedRecipient;
}
