package service.service;

import dto.UserDTO;
import entity.User;

public interface UserService{
    boolean existsByName(String name);
    boolean existsByPassword(String password);
    User findByName(String name);
    void addUser(UserDTO user);
}
