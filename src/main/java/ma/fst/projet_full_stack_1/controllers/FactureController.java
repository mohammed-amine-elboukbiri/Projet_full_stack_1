package ma.fst.projet_full_stack_1.controllers;

import ma.fst.projet_full_stack_1.entities.Facture;
import ma.fst.projet_full_stack_1.services.FactureService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/factures")
public class FactureController {

    private final FactureService factureService;

    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }

    @PostMapping
    public Facture create(@RequestBody Facture facture) {
        return factureService.createFacture(facture);
    }

    @GetMapping
    public List<Facture> getAll() {
        return factureService.getAllFactures();
    }
}