package com.csi.controller;

import com.csi.model.EmailModel;
import com.csi.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("")
    public ResponseEntity<String> sendEmail(@RequestBody EmailModel emailModel) {

        emailService.sendEmail(emailModel);

        log.info("########Send Email To " + emailModel.getToEmail());

        return ResponseEntity.ok("Email sent Successfully");


    }
}
