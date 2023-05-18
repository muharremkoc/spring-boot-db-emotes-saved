package com.emotes.springbootdbemotessaved.controller;

import com.emotes.springbootdbemotessaved.domain.User;
import com.emotes.springbootdbemotessaved.model.UserRequestDto;
import com.emotes.springbootdbemotessaved.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody UserRequestDto userRequestDto){
        return userService.createUser(userRequestDto);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PatchMapping("/user/{userId}")
    public User changeEmotionWithUserId(@PathVariable("userId") int userId,@RequestParam String emotion){
        return userService.changeEmotesWithUserId(userId, emotion);
    }


}
