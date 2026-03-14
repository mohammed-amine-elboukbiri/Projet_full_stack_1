package ma.fst.projet_full_stack_1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricule;

    private String nom;

    private String prenom;

    private String telephone;

    private String email;

    private String login;

    private String password;

    @ManyToOne
    private Profil profil;
}