package com.notifications.ms.service;

import com.notifications.ms.dto.EmailDTO;
import com.notifications.ms.exceptions.EmailNotSentException;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {

    private JavaMailSender emailSender;

    public void senEmail(EmailDTO emailDTO) throws EmailNotSentException {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(emailDTO.getTo());
        mailMessage.setText(emailDTO.getBody());
        mailMessage.setSubject(emailDTO.getSubject());

        try {
            emailSender.send(mailMessage);
        } catch (Exception e) {
            throw new EmailNotSentException("Failed to send email: " + e.getMessage());
        }
    }
}
