package ma.fst.projet_full_stack_1.dto;

import java.time.LocalDate;

public class FactureDTO {

    private Long id;
    private String numero;
    private Double montant;
    private LocalDate dateFacture;
    private Boolean payee;
    private String code ;

    public FactureDTO() {
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public Double getMontant() {
        return montant;
    }

    public LocalDate getDateFacture() {
        return dateFacture;
    }

    public Boolean getPayee() {
        return payee;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public void setDateFacture(LocalDate dateFacture) {
        this.dateFacture = dateFacture;
    }

    public void setPayee(Boolean payee) {
        this.payee = payee;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}