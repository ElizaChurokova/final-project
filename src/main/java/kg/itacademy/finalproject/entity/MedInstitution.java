package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "med_institution")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedInstitution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "institution_type_id")
    private MedInstitutionType medInstitutionType;
//    @OneToMany(mappedBy = "institution_type_id")
//    private Set<MedInstitutionType> medInstitutionTypes;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "contact_number")
    private Integer contactNumber;
    @ManyToMany(mappedBy = "medPersonalDetailMedInstitutionsOme")
    private List<MedPersonalDetails> MedPersonalDetailsOne;
    @ManyToMany(mappedBy = "medPersonalDetailMedInstitutionsTwo")
    private List<MedPersonalDetails> MedPersonalDetailsTwo;


}
