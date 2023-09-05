package dev.matheusvictor.springbootcleanarch.main;

import dev.matheusvictor.springbootcleanarch.application.gateways.UserGateway;
import dev.matheusvictor.springbootcleanarch.application.usecases.CreateUserInteractor;
import dev.matheusvictor.springbootcleanarch.infraestructure.controllers.UserDTOMapper;
import dev.matheusvictor.springbootcleanarch.infraestructure.gateways.UserEntityMapper;
import dev.matheusvictor.springbootcleanarch.infraestructure.gateways.UserRepositoryGateway;
import dev.matheusvictor.springbootcleanarch.infraestructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserInteractor(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
