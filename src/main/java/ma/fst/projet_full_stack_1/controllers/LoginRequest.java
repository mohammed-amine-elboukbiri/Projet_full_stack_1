package ma.fst.projet_full_stack_1.controllers;

import lombok.Data;

@Data
public class LoginRequest {
    private String login;
    private String password;
}