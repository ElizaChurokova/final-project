package kg.itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalVisitModel {
    private Long userId;
    private Long visitTypeId;
    private Date dateOfVisit;
    private Long directionId;
    private Long medPersonalId;
    private Long initialVisitId;
    private Long labtestResultId;
    private String doctorExamDescription;
    private String diagnosis;
    private Long todoLabTestId;
    private String todoHavePills;
    private Long medInstitutionId;
}
