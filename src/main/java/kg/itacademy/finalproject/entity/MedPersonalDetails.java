package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "med_personal_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedPersonalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "users_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "direction_id")
    private Direction direction;

    @ManyToMany
    private List<MedInstitution> MedInstitutionsOne;


}
