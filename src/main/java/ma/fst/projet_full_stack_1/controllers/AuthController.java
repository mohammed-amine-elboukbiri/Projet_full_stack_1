package ma.fst.projet_full_stack_1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login() {
        return "Login endpoint";
    }

    @GetMapping("/me")
    public String me() {
        return "Current user";
    }
}