package ma.fst.projet_full_stack_1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.swing.text.Document;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String nom;

    private String description;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private Double montant;

    @ManyToOne
    private Organisme organisme;

    @ManyToOne
    private Employe chefProjet;

    @OneToMany(mappedBy = "projet")
    private List<Phase> phases;

    @OneToMany(mappedBy = "projet")
    private List<Document> documents;
}