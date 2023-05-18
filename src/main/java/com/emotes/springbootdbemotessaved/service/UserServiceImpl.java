package com.emotes.springbootdbemotessaved.service;

import com.emotes.springbootdbemotessaved.domain.User;
import com.emotes.springbootdbemotessaved.model.UserRequestDto;
import com.emotes.springbootdbemotessaved.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequestDto userRequestDto) {
        User user = new User();
        user.setUsername(userRequestDto.getUsername());
        user.setEmotion(userRequestDto.getEmotion());

        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User changeEmotesWithUserId(int userId, String emotion) {
        User existUser = userRepository.findById(userId).orElseThrow(()->new RuntimeException(String.format("%s %s","User Not Found with ID:",userId)));
        existUser.setEmotion(emotion);
        return userRepository.save(existUser);
    }
}
