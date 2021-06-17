package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "med_institution_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedInstitutionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type_name", nullable = false)
    private String typeName;

}
