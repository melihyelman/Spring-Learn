package com.melihyelman.rest.spring_task.restful_web_services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundExpection("Not found user id: " + id));
    }
    public void deleteUserById(int id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundExpection("Not found user id: " + id);
        }
        userRepository.deleteById(id);
    }

    public User createUser(User user) {
        User foundUser = userRepository.findByName(user.getName());
        if (foundUser != null) {
            throw new UserAlreadyExistsException("User with username " + user.getName() + " already exists.");
        }
        return userRepository.save(user);
    }
    public boolean loginUser(String username, String password) {
        User foundUser = userRepository.findByName(username);
        if (foundUser == null) {
            return false;
        }
        return password.equals(foundUser.getPassword());
    }
}
