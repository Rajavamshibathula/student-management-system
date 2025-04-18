package com.raviinfotech.springstudentcrud.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmailAccountConfirmation(String to) {
		 SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(to);
	        message.setFrom("rajavamshibathula@gmail.com");
	        message.setSubject("Confiramation Regarding SignUp");
	        message.setText("Account created Successfully");

	        mailSender.send(message);
	}

}
