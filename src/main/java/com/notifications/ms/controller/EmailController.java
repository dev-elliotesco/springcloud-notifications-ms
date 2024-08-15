package com.notifications.ms.controller;

import com.notifications.ms.controller.docs.EmailDoc;
import com.notifications.ms.model.EmailRequest;
import com.notifications.ms.service.EmailService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/email")
public class EmailController implements EmailDoc {

    private EmailService emailService;

    @SneakyThrows
    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailRequest emailRequest){
            emailService.senEmail(emailRequest);
            return "Email sent successfully";
    }
}
