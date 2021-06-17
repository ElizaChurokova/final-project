package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "visit_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "visit_type_name", nullable = false)
    private String visitTypeName;

}
