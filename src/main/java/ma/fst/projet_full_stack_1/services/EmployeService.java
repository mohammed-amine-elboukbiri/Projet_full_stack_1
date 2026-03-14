package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Employe;
import ma.fst.projet_full_stack_1.repositories.EmployeRepository;
import ma.fst.projet_full_stack_1.exceptions.ResourceNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;

    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public Employe createEmploye(Employe employe) {
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

        existing.setMatricule(employe.getMatricule());
        existing.setNom(employe.getNom());
        existing.setPrenom(employe.getPrenom());
        existing.setTelephone(employe.getTelephone());
        existing.setEmail(employe.getEmail());
        existing.setLogin(employe.getLogin());
        existing.setPassword(employe.getPassword());

        return employeRepository.save(existing);
    }

    public void deleteEmploye(Long id) {

        Employe employe = getEmployeById(id);
        employeRepository.delete(employe);
    }
}