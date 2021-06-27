package kg.itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitModel {
    private Long userId;
    private Date dateOfVisit;
    private Long directionId;
    private Long medPersonalId;
    private String complaintDescription;
    private String doctorExamDescription;
    private String diagnosis;
    private Long todoLabTestId;
    private String todoHavePills;
    private Long medInstitutionId;

}
