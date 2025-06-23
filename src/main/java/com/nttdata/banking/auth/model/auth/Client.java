package com.nttdata.banking.auth.model.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Represents a user named {@link Client} in the system.
 * This class contains information about the user's identity, contact details, status, and type.
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Client {

    private String id;
    private String names;
    private String surnames;
    private String clientType;
    private String documentType;
    private String documentNumber;
    private Integer cellphone;
    private String email;
    private String userType;
    private String password;
    private Boolean state;
    private String profile;
}
