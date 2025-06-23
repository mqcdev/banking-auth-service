package com.nttdata.banking.auth.service.impl;

import com.nttdata.banking.auth.client.UserServiceClient;
import com.nttdata.banking.auth.model.auth.Client;
import com.nttdata.banking.auth.model.auth.dto.request.RegisterRequest;
import com.nttdata.banking.auth.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Implementation of the {@link RegisterService} interface.
 * Handles the logic for user registration by forwarding the request to the {@link UserServiceClient}.
 */
@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {

    private final UserServiceClient userServiceClient;

    /**
     * Registers a new user with the provided registration details.
     *
     * @param registerRequest the registration request containing user details (email, password, etc.)
     * @return the registered {@link Client} object
     */
    @Override
    public Client registerUser(RegisterRequest registerRequest) {
        return userServiceClient.register(registerRequest).getBody();
    }

}
