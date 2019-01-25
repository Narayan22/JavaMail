package com.cignex;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController
{
	@Autowired
	private SmtpMailSender smtpMailSender;
	
	@RequestMapping("/sendMail")
	public void sendMail() throws MessagingException
	{
		smtpMailSender.send("bhadadanarayan@gmail.com", "yesBoss", "hii i am a java Devloper");
	}

}
