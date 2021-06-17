package kg.itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedInstitutionModel {
    private String name;
    private Long institutionTypeId;
    private String address;
    private Integer contactNumber;



}
