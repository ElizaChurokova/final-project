package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "lab_test_result")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabTestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "result_description")
    private String resultDescription;
    @ManyToOne
    @JoinColumn(name = "medInstitutionId")
    private MedInstitution medInstitution;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

}
