package dev.matheusvictor.springbootcleanarch.infraestructure.controllers;

import dev.matheusvictor.springbootcleanarch.application.usecases.CreateUserInteractor;
import dev.matheusvictor.springbootcleanarch.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
  private final CreateUserInteractor createUserInteractorr;

  private final UserDTOMapper userDTOMapper;

  public UserController(CreateUserInteractor createUserInteractorr,
                        UserDTOMapper userDTOMapper) {
    this.createUserInteractorr = createUserInteractorr;
    this.userDTOMapper = userDTOMapper;
  }





  @PostMapping
  CreateUserResponse create(@RequestBody CreateUserRequest request) {
    User userBusinessObj = userDTOMapper.toUser(request);
    User user = createUserInteractorr.createUser(userBusinessObj);
    return userDTOMapper.toResponse(user);
  }
}
