package com.emotes.springbootdbemotessaved.service;

import com.emotes.springbootdbemotessaved.domain.User;
import com.emotes.springbootdbemotessaved.model.UserRequestDto;

import java.util.List;

public interface UserService {

    User createUser(UserRequestDto userRequestDto);

    List<User> getUsers();

    User changeEmotesWithUserId(int userId,String emotion);
}
