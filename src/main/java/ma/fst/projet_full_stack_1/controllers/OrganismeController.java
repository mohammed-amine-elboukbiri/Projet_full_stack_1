package ma.fst.projet_full_stack_1.controllers;

import ma.fst.projet_full_stack_1.entities.Organisme;
import ma.fst.projet_full_stack_1.services.OrganismeService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organismes")
public class OrganismeController {

    private final OrganismeService organismeService;

    public OrganismeController(OrganismeService organismeService) {
        this.organismeService = organismeService;
    }

    // CREATE
    @PostMapping
    public Organisme createOrganisme(@RequestBody Organisme organisme) {
        return organismeService.createOrganisme(organisme);
    }

    // READ ALL
    @GetMapping
    public List<Organisme> getAllOrganismes() {
        return organismeService.getAllOrganismes();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Organisme getOrganismeById(@PathVariable Long id) {
        return organismeService.getOrganismeById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Organisme updateOrganisme(
            @PathVariable Long id,
            @RequestBody Organisme organisme) {

        return organismeService.updateOrganisme(id, organisme);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteOrganisme(@PathVariable Long id) {
        organismeService.deleteOrganisme(id);
    }

}
