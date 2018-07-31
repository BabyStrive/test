package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTestApplicationTests {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String sender;

	@Test
	public void testsendMail() throws Exception{
		SimpleMailMessage message= new SimpleMailMessage();
		message.setFrom(sender);
		message.setTo("1358224153@qq.com");
		message.setSubject("测试邮件发送工具");
		message.setText("杨帅帅同学好，这是一个测试邮件，我是机器人，请自动忽略，我可能会每隔一段时间为您发送一个邮件");
		javaMailSender.send(message);		
	
	}

}
