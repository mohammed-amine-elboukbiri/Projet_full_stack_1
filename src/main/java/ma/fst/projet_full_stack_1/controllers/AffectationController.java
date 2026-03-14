package ma.fst.projet_full_stack_1.controllers;

import ma.fst.projet_full_stack_1.entities.Affectation;
import ma.fst.projet_full_stack_1.services.AffectationService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/affectations")
public class AffectationController {

    private final AffectationService affectationService;

    public AffectationController(AffectationService affectationService) {
        this.affectationService = affectationService;
    }

    @PostMapping
    public Affectation create(@RequestBody Affectation affectation) {
        return affectationService.createAffectation(affectation);
    }

    @GetMapping
    public List<Affectation> getAll() {
        return affectationService.getAllAffectations();
    }
}