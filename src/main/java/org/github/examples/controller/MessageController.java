package org.github.examples.controller;

import org.github.examples.dto.EmployeeDTO;
import org.github.examples.service.MessageSenderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class MessageController {
    public MessageSenderService senderService;
    public MessageController(MessageSenderService senderService){
        this.senderService = senderService;
    }

    @PostMapping("/Employee")
    public ResponseEntity<String> postMessage(@Valid @RequestBody EmployeeDTO employee){
        senderService.send(employee);
        return ResponseEntity.ok("success");
    }
}
