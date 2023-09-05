package dev.matheusvictor.springbootcleanarch.infraestructure.persistence;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
