package ma.fst.projet_full_stack_1.controllers;

import ma.fst.projet_full_stack_1.entities.Employe;
import ma.fst.projet_full_stack_1.services.EmployeService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
public class EmployeController {

    private final EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @PostMapping
    public Employe create(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }

    @GetMapping
    public List<Employe> getAll() {
        return employeService.getAllEmployes();
    }

    @GetMapping("/{id}")
    public Employe getById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }

    @PutMapping("/{id}")
    public Employe update(@PathVariable Long id,
                          @RequestBody Employe employe) {
        return employeService.updateEmploye(id, employe);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}
