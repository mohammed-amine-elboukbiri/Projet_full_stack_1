package ma.fst.projet_full_stack_1.dto;

import java.time.LocalDate;

public class PhaseDTO {

    private Long id;
    private String code;
    private String libelle;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Double montant;

    private Boolean etatRealisation;
    private Boolean etatFacturation;
    private Boolean etatPaiement;

    public PhaseDTO() {
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Boolean getEtatFacturation() {
        return etatFacturation;
    }

    public Boolean getEtatPaiement() {
        return etatPaiement;
    }

    public Boolean getEtatRealisation() {
        return etatRealisation;
    }

    public String getDescription() {
        return description;
    }

    public String getLibelle() {
        return libelle;
    }

    public Double getMontant() {
        return montant;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setEtatFacturation(Boolean etatFacturation) {
        this.etatFacturation = etatFacturation;
    }

    public void setEtatPaiement(Boolean etatPaiement) {
        this.etatPaiement = etatPaiement;
    }

    public void setEtatRealisation(Boolean etatRealisation) {
        this.etatRealisation = etatRealisation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}