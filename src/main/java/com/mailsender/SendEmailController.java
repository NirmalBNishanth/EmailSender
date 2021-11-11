package com.mailsender;

import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SendEmailController {
	
	@Autowired
	EmailSenderApplication emailSenderApplication;

	@RequestMapping(value = "/sendemail")
	public String send() throws AddressException, MessagingException, IOException 
	{
	   emailSenderApplication.sendEmail();
	   return "Email sent successfully";   
	}
}

