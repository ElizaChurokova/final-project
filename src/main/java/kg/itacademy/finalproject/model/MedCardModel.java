package kg.itacademy.finalproject.model;

import kg.itacademy.finalproject.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedCardModel {
    private Long userId;
    private Date dateOfBirth;
    private String gender;
    private String address;
    private Long bloodGroupId;
    private Long allergyId;
    private Long chronicDiseaseId;
    private Long vaccineId;
      }
