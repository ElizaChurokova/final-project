package kg.itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedPersonalDetailsModel {
    private Long userId;
    private Long directionId;
    private Long medInstitutionId;
}
