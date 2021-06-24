package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "disease_history")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiseaseHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
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

    @Column(name = "complaint_description")
    private String complaintDescription;
    @Column(name = "doctor_exam_description")
    private String doctorExamDesciption;
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
