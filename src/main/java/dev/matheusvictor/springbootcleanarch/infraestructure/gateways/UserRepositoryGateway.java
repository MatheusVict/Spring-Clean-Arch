package dev.matheusvictor.springbootcleanarch.infraestructure.gateways;

import dev.matheusvictor.springbootcleanarch.application.gateways.UserGateway;
import dev.matheusvictor.springbootcleanarch.domain.entity.User;
import dev.matheusvictor.springbootcleanarch.infraestructure.persistence.UserEntity;
import dev.matheusvictor.springbootcleanarch.infraestructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
         UserEntity saveObj = userRepository.save(userEntity);
         return userEntityMapper.toDomainObj(saveObj);
    }
}
