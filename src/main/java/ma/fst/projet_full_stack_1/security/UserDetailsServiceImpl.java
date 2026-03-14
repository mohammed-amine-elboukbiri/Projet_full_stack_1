package ma.fst.projet_full_stack_1.security;

import ma.fst.projet_full_stack_1.entities.Employe;
import ma.fst.projet_full_stack_1.repositories.EmployeRepository;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final EmployeRepository employeRepository;

    public UserDetailsServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Employe employe = employeRepository
                .findByLogin(username)
                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));

        return User
                .withUsername(employe.getLogin())
                .password(employe.getPassword())
                .roles("USER")
                .build();
    }
}