package ma.fst.projet_full_stack_1.mappers;

import ma.fst.projet_full_stack_1.entities.Phase;
import ma.fst.projet_full_stack_1.dto.PhaseDTO;

public class PhaseMapper {

    public static PhaseDTO toDTO(Phase phase) {

        PhaseDTO dto = new PhaseDTO();

        dto.setId(phase.getId());
        dto.setCode(phase.getCode());
        dto.setLibelle(phase.getLibelle());
        dto.setDescription(phase.getDescription());
        dto.setDateDebut(phase.getDateDebut());
        dto.setDateFin(phase.getDateFin());
        dto.setMontant(phase.getMontant());

        return dto;
    }

    public static Phase toEntity(PhaseDTO dto) {

        Phase phase = new Phase();

        phase.setId(dto.getId());
        phase.setCode(dto.getCode());
        phase.setLibelle(dto.getLibelle());
        phase.setDescription(dto.getDescription());
        phase.setDateDebut(dto.getDateDebut());
        phase.setDateFin(dto.getDateFin());
        phase.setMontant(dto.getMontant());

        return phase;
    }
}