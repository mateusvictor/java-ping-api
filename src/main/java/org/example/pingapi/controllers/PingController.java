package org.example.pingapi.controllers;

import lombok.RequiredArgsConstructor;
import org.example.pingapi.application.usecases.PingUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("ping-controller")
@RequiredArgsConstructor
public class PingController {
  public final PingUseCase pingUseCase;

  @GetMapping("/ping")
  public ResponseEntity<?> ping(@RequestParam(value = "name", required = false) String name){
    var response = pingUseCase.perform(name);

    return ResponseEntity.ok(response);
  }
}
