package dev.matheusvictor.springbootcleanarch.infraestructure.gateways;


import dev.matheusvictor.springbootcleanarch.domain.entity.User;
import dev.matheusvictor.springbootcleanarch.infraestructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(
                userDomainObj.userName(),
                userDomainObj.password(),
                userDomainObj.email()
        );
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getPassword()
        );
    }
}
