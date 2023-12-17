package org.scalablemsa.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/check")
    public ResponseEntity<?> getBasicResponse(){
        return ResponseEntity.ok("server running");
    }

    @GetMapping("/list")
    public ResponseEntity<?> getUserList(){
        //todo:RDS에서 User정보 얻어오는 로직
        return null;
    }
}