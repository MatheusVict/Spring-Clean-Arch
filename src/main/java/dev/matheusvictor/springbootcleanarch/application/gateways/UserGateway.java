package dev.matheusvictor.springbootcleanarch.application.gateways;

import dev.matheusvictor.springbootcleanarch.domain.entity.User;

public interface UserGateway {

    User createUser(User user);
}
