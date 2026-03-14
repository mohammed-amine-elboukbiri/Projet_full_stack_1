package ma.fst.projet_full_stack_1.controllers;

import ma.fst.projet_full_stack_1.entities.Projet;
import ma.fst.projet_full_stack_1.services.ProjetService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projets")
public class ProjetController {

    private final ProjetService projetService;

    public ProjetController(ProjetService projetService) {
        this.projetService = projetService;
    }

    @PostMapping
    public Projet create(@RequestBody Projet projet) {
        return projetService.createProjet(projet);
    }

    @GetMapping
    public List<Projet> getAll() {
        return projetService.getAllProjets();
    }

    @GetMapping("/{id}")
    public Projet getById(@PathVariable Long id) {
        return projetService.getProjetById(id);
    }

    @PutMapping("/{id}")
    public Projet update(@PathVariable Long id,
                         @RequestBody Projet projet) {
        return projetService.updateProjet(id, projet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projetService.deleteProjet(id);
    }
}