package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Employe;
import ma.fst.projet_full_stack_1.repositories.EmployeRepository;
import ma.fst.projet_full_stack_1.exceptions.ResourceNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;

    public EmployeService(EmployeRepository employeRepository,
                          org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        this.employeRepository = employeRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Employe createEmploye(Employe employe) {
        employe.setPassword(passwordEncoder.encode(employe.getPassword()));
        return employeRepository.save(employe);
    }
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employe non trouvé"));
    }

    public Employe updateEmploye(Long id, Employe employe) {

        Employe existing = getEmployeById(id);

        if (employe.getPassword() != null && !employe.getPassword().isBlank()) {
            existing.setPassword(passwordEncoder.encode(employe.getPassword()));
        }

        existing.setMatricule(employe.getMatricule());
        existing.setNom(employe.getNom());
        existing.setPrenom(employe.getPrenom());
        existing.setTelephone(employe.getTelephone());
        existing.setEmail(employe.getEmail());
        existing.setLogin(employe.getLogin());
        existing.setProfil(employe.getProfil());

        return employeRepository.save(existing);
    }

    public void deleteEmploye(Long id) {

        Employe employe = getEmployeById(id);
        employeRepository.delete(employe);
    }
}