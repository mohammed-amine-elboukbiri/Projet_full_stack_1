package ma.fst.projet_full_stack_1.dto;

import java.time.LocalDate;

public class AffectationDTO {

    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Double tauxOccupation;

    public AffectationDTO() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public Double getTauxOccupation() {
        return tauxOccupation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public void setTauxOccupation(Double tauxOccupation) {
        this.tauxOccupation = tauxOccupation;
    }
}