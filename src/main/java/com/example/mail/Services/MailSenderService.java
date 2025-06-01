package com.example.mail.Services;


import com.example.mail.Entities.MailSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Slf4j
@Service
public class MailSenderService{


    private JavaMailSender javaMailSender;

    public void EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    public void sendMail(MailSender mail)
    {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("derbaliseif.biat@gmail.com");
        mailSender.setPassword("npwbjteezsqaflly");

        Properties properties = new Properties();
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");

        mailSender.setJavaMailProperties(properties);
        String from = mailSender.getUsername();
        String to = "seif.derbali4@gmail.com";

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setSubject(mail.getSubject());
        message.setText(mail.getMsg()+ ".\n\n From "+mail.getName()+ ",\n"+mail.getMail());

        mailSender.send(message);

    }
   }