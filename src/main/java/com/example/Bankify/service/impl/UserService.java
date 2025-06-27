package com.example.Bankify.service.impl;

import com.example.Bankify.dto.BankResponse;
import com.example.Bankify.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);

}
