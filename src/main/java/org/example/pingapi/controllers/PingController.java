package org.example.pingapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("ping-controller")
public class PingController {
  @GetMapping("/ping")
  public ResponseEntity<?> ping(@RequestParam(value = "name", required = false) String name){
    return ResponseEntity.ok(String.format("PING PING PING ping = %s", name));
  }
}
