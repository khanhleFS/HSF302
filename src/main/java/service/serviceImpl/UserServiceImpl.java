package service.serviceImpl;

import dto.UserDTO;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
     private UserRepository userRepository;

    @Override
    public boolean existsByName(String name) {
        return userRepository.existsByName(name);
    }

    @Override
    public boolean existsByPassword(String password) {
        return userRepository.existsByPassword(password);
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public void addUser(UserDTO user) {
        User userd = new User();
        userd.setUserName(user.getUserName());
        userd.setPassword(user.getPassword());
        userRepository.save(user);
    }
}
