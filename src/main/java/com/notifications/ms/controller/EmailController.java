package com.notifications.ms.controller;

import com.notifications.ms.controller.docs.EmailDoc;
import com.notifications.ms.dto.EmailDTO;
import com.notifications.ms.service.EmailService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailController implements EmailDoc {

    private final EmailService emailService;

    @SneakyThrows
    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@Valid @RequestBody EmailDTO emailDTO){
            emailService.senEmail(emailDTO);
            return new ResponseEntity<>("Email sent successfully", HttpStatus.OK);
    }
}
