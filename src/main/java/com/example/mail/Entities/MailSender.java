package com.example.mail.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MailSender {

    String name;
    String mail;
    String subject;
    String msg;


}