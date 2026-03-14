package ma.fst.projet_full_stack_1.controllers;

import ma.fst.projet_full_stack_1.entities.Phase;
import ma.fst.projet_full_stack_1.services.PhaseService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phases")
public class PhaseController {

    private final PhaseService phaseService;

    public PhaseController(PhaseService phaseService) {
        this.phaseService = phaseService;
    }

    @PostMapping
    public Phase create(@RequestBody Phase phase) {
        return phaseService.createPhase(phase);
    }

    @GetMapping
    public List<Phase> getAll() {
        return phaseService.getAllPhases();
    }

    @GetMapping("/{id}")
    public Phase getById(@PathVariable Long id) {
        return phaseService.getPhaseById(id);
    }

    @PutMapping("/{id}")
    public Phase update(@PathVariable Long id,
                        @RequestBody Phase phase) {
        return phaseService.updatePhase(id, phase);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        phaseService.deletePhase(id);
    }
}