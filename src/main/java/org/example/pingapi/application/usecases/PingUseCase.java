package org.example.pingapi.application.usecases;

import lombok.extern.slf4j.Slf4j;
import org.example.pingapi.application.dtos.PingResponse;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PingUseCase {
  public PingResponse perform(String name) {
    return PingResponse.builder().message("Pong!").name(name).build();
  }
}
