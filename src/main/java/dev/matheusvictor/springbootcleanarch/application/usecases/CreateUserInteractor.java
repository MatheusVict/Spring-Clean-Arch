package dev.matheusvictor.springbootcleanarch.application.usecases;

import dev.matheusvictor.springbootcleanarch.application.gateways.UserGateway;
import dev.matheusvictor.springbootcleanarch.domain.entity.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
