package com.nttdata.banking.auth.model.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

/**
 * Represents a request named {@link TokenRefreshRequest} to refresh an access token using a refresh token.
 * This class contains the refresh token required for obtaining a new access token.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenRefreshRequest {

    @NotBlank
    private String refreshToken;

}
