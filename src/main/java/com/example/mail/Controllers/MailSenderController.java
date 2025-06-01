package com.example.mail.Controllers;


import com.example.mail.Entities.MailSender;
import com.example.mail.Services.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
@CrossOrigin(origins = {"*","http://localhost:4200/"})
public class MailSenderController {

    @Autowired
    MailSenderService Ms;

    @PostMapping()
    void find(@RequestBody MailSender mail){
         Ms.sendMail(mail);
    }

}