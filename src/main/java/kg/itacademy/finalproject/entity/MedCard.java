package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "med_card")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "users_id")
    private User user;
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "address")
    private String address;
    @ManyToOne
    @JoinColumn(name = "blood_group_id")
    private BloodGroup bloodGroup;
    @ManyToMany
    @JoinColumn(name = "allergy_id")
    private List<Allergy> allergies;
    @ManyToMany
    @JoinColumn(name = "chronic_disease_id")
    private List<ChronicDisease> chronicDiseases;
    @ManyToMany
    @JoinColumn(name = "vaccine_id")
    private List<Vaccine> vaccines;
    @ManyToOne
    @JoinColumn(name = "visit_id")
    private Visit visit;




}
