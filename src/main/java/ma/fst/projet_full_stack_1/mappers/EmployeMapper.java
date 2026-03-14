package ma.fst.projet_full_stack_1.mappers;

import ma.fst.projet_full_stack_1.entities.Employe;
import ma.fst.projet_full_stack_1.dto.EmployeDTO;

public class EmployeMapper {

    public static EmployeDTO toDTO(Employe employe) {

        EmployeDTO dto = new EmployeDTO();

        dto.setId(employe.getId());
        dto.setMatricule(employe.getMatricule());
        dto.setNom(employe.getNom());
        dto.setPrenom(employe.getPrenom());
        dto.setTelephone(employe.getTelephone());
        dto.setEmail(employe.getEmail());
        dto.setLogin(employe.getLogin());

        return dto;
    }

    public static Employe toEntity(EmployeDTO dto) {

        Employe employe = new Employe();

        employe.setId(dto.getId());
        employe.setMatricule(dto.getMatricule());
        employe.setNom(dto.getNom());
        employe.setPrenom(dto.getPrenom());
        employe.setTelephone(dto.getTelephone());
        employe.setEmail(dto.getEmail());
        employe.setLogin(dto.getLogin());

        return employe;
    }
}