package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "additional_visit")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdditionalVisit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "visit_type_id")
    private VisitType visitType;

    @Column(name = "date_of_visit")
    private Date dateOfVisit;

    @ManyToOne
    @JoinColumn(name = "direction_id")
    private Direction direction;

    @ManyToOne
    @JoinColumn(name = "med_personal_id")
    private MedPersonalDetails medPersonalDetails;
    @OneToOne
    @JoinColumn(name = "initial_visit_id")
    private InitialVisit initialVisit;
    @OneToOne
    @JoinColumn(name = "labtest_result_id")
    private LabTestResult labTestResult;
    @Column(name = "doctor_exam_description")
    private String doctorExamDescription;
    @Column (name = "diagnosis")
    private String diagnosis;
    @ManyToMany
    @JoinColumn (name = "todo_labtest_id")
    private List<Labtest> labtest;
    @Column(name = "todo_have_pills")
    private String todoHavePills;
    @ManyToOne
    @JoinColumn(name = "med_institution_id")
    private MedInstitution medInstitution;



}
