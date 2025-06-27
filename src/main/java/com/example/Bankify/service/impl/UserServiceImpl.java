package com.example.Bankify.service.impl;

import com.example.Bankify.dto.BankResponse;
import com.example.Bankify.dto.UserRequest;
import com.example.Bankify.entity.User;

public class UserServiceImpl implements UserService{
    @Override
    public BankResponse createAccount(UserRequest userRequest) {

        /* creating an account - saving a new user into the DB */
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .email(userRequest.getEmail())
                .phoneNumber(userRequest.getPhoneNumber())
                .alternatePhoneNumber(userRequest.getAlternatePhoneNumber())
                .status(userRequest.getStatus())
                .build();
    }
}
