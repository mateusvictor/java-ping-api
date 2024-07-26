package org.example.pingapi.application.dtos;


import lombok.Builder;

@Builder
public record PingResponse(String message, String name) {
}
