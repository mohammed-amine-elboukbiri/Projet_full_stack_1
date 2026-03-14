package ma.fst.projet_full_stack_1.controllers;

import ma.fst.projet_full_stack_1.entities.Livrable;
import ma.fst.projet_full_stack_1.services.LivrableService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livrables")
public class LivrableController {

    private final LivrableService livrableService;

    public LivrableController(LivrableService livrableService) {
        this.livrableService = livrableService;
    }

    @PostMapping
    public Livrable create(@RequestBody Livrable livrable) {
        return livrableService.createLivrable(livrable);
    }

    @GetMapping
    public List<Livrable> getAll() {
        return livrableService.getAllLivrables();
    }
}
