package com.example.emailintegrations.controller;

import com.example.emailintegrations.service.EmailServices;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/email")
public class EmailController {
    private final EmailServices emailService;

    @PostMapping("/send")
    public String sendEmail(
            @RequestParam String to,
            @RequestParam String subject,
            @RequestParam String text

    ) throws MessagingException, UnsupportedEncodingException {
        emailService.sendSimpleMessage(to, subject, text, "From KC") ;
        return "Email sent successfully!";
    }
}


