package com.nttdata.banking.auth.service;

import com.nttdata.banking.auth.model.auth.dto.request.LoginRequest;
import com.nttdata.banking.auth.model.auth.dto.response.TokenResponse;
import com.nttdata.banking.auth.model.common.dto.response.CustomResponse;

/**
 * Service interface named {@link UserLoginService} for user login operations.
 * Provides methods for handling user login and generating authentication tokens.
 */
public interface UserLoginService {

    /**
     * Logs in a user by processing the provided login request and generating authentication tokens.
     *
     * @param loginRequest the login request containing user credentials (email and password)
     * @return a {@link CustomResponse} containing the {@link TokenResponse} with authentication tokens
     */
    CustomResponse<TokenResponse> login(final LoginRequest loginRequest);

}
