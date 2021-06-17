package kg.itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabTestResultModel {
    private String resultDescription;
    private Long medInstitutionId;
    private Long userId;
}
