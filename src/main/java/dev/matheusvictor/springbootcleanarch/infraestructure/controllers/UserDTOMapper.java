package dev.matheusvictor.springbootcleanarch.infraestructure.controllers;

import dev.matheusvictor.springbootcleanarch.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.userName(), user.email());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.username(), request.password(), request.email());
    }
}
