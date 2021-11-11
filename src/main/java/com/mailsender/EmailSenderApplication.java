package com.mailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class EmailSenderApplication 
{

	@Autowired
    private JavaMailSender javaMailSender;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(EmailSenderApplication.class, args);
	}
	
	void sendEmail() 
	{

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("Recievers Mail");
        msg.setSubject("Subject of Mail");
        msg.setText("Hello \n This is Email Body");

        javaMailSender.send(msg);

    }
}
