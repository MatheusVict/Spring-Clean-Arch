package dev.matheusvictor.springbootcleanarch.service;

import dev.matheusvictor.springbootcleanarch.model.User;
import dev.matheusvictor.springbootcleanarch.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User create(User user) {
    return userRepository.save(user);
  }
}
