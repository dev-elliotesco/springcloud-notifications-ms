package com.notifications.ms.service;

import com.notifications.ms.dto.EmailDTO;
import com.notifications.ms.exceptions.EmailNotSentException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {

    private JavaMailSender emailSender;

    public void senEmail(EmailDTO emailDTO) throws EmailNotSentException {
        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(emailDTO.getTo());
            helper.setSubject(emailDTO.getSubject());
            helper.setText(emailDTO.getBody());

            emailSender.send(message);
        } catch (Exception e) {
            throw new EmailNotSentException("Failed to send email: " + e.getMessage());
        }
    }
}
