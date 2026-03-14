package ma.fst.projet_full_stack_1.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Affectation {

    @EmbeddedId
    private AffectationId id;

    @ManyToOne
    @MapsId("employeId")
    private Employe employe;

    @ManyToOne
    @MapsId("phaseId")
    private Phase phase;

    private LocalDate dateDebut;

    private LocalDate dateFin;
}