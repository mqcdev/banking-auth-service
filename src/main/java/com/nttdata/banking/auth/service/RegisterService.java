package com.nttdata.banking.auth.service;

import com.nttdata.banking.auth.model.auth.Client;
import com.nttdata.banking.auth.model.auth.dto.request.RegisterRequest;

/**
 * Service interface named {@link RegisterService} for user registration operations.
 * Provides methods for registering a new user.
 */
public interface RegisterService {

    /**
     * Registers a new user with the provided registration details.
     *
     * @param registerRequest the registration request containing user details (email, password, etc.)
     * @return the registered {@link Client} object
     */
    Client registerUser(final RegisterRequest registerRequest);

}
