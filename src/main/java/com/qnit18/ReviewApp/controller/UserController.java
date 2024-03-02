package com.qnit18.ReviewApp.controller;

import com.qnit18.ReviewApp.dto.request.UserCreationRequest;
import com.qnit18.ReviewApp.service.UserService;
import com.qnit18.ReviewApp.entity.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired private UserService userService;

    @PostMapping
    public User createUser(@RequestBody @Valid UserCreationRequest request){
        return userService.createUser(request);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") String userId){
        return userService.getUsers(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody UserCreationRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    public String deleteUserId(@PathVariable String userId){
         userService.delUser(userId);
         return "Delete User success!";
    }
}
