package org.scalablemsa.user.controller;

import lombok.RequiredArgsConstructor;
import org.scalablemsa.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/check")
    public ResponseEntity<?> getBasicResponse(){
        return ResponseEntity.ok("server running");
    }

    @GetMapping("/list")
    public ResponseEntity<?> getUserList(){
        return ResponseEntity.ok(userService.getUserList());
    }
}