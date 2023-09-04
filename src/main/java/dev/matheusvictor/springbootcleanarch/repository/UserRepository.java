package dev.matheusvictor.springbootcleanarch.repository;

import org.springframework.data.repository.CrudRepository;

import dev.matheusvictor.springbootcleanarch.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
