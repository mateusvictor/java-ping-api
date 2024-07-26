package org.example.pingapi.usecases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.pingapi.application.usecases.PingUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PingUseCaseTest {
  @InjectMocks
  private PingUseCase useCase;

  @Test
  void shouldPerformSuccessfully() {
    // Given
    var name = "Mateus";

    // When
    var response = useCase.perform(name);

    // Then
    assertEquals(name, response.name());
    assertEquals("Pong!", response.message());
  }
}
