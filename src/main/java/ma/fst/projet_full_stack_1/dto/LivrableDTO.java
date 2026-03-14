package ma.fst.projet_full_stack_1.dto;

public class LivrableDTO {

    private Long id;
    private String code;
    private String libelle;
    private String description;
    private String chemin ;

    public LivrableDTO() {
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }
}