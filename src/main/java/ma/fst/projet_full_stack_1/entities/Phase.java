package ma.fst.projet_full_stack_1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String libelle;

    private String description;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private Double montant;

    private boolean etatRealisation;

    private boolean etatFacturation;

    private boolean etatPaiement;

    @ManyToOne
    private Projet projet;

    @OneToMany(mappedBy = "phase")
    private List<Livrable> livrables;
}