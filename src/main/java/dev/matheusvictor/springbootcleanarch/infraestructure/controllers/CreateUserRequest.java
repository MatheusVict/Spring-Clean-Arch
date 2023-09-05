package dev.matheusvictor.springbootcleanarch.infraestructure.controllers;

public record CreateUserRequest(
        String username,
        String password,
        String email
) {
}
