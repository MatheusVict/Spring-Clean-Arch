package dev.matheusvictor.springbootcleanarch.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.matheusvictor.springbootcleanarch.model.User;
import dev.matheusvictor.springbootcleanarch.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  User create(@RequestBody User user) {
    return userService.create(user);
  }
}
