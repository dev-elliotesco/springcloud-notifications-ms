package com.notifications.ms.service;

import com.notifications.ms.exceptions.EmailNotSentException;
import com.notifications.ms.model.EmailRequest;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {

    private JavaMailSender emailSender;

    public void senEmail(EmailRequest emailRequest) throws EmailNotSentException {
        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(emailRequest.getTo());
            helper.setSubject(emailRequest.getSubject());
            helper.setText(emailRequest.getBody());

            emailSender.send(message);
        } catch (Exception e) {
            throw new EmailNotSentException("Failed to send email: " + e.getMessage());
        }
    }
}
