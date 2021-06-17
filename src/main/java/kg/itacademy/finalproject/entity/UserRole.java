package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users_role")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "role_name", nullable = false)
    private String roleName;
  //  @ManyToOne
  //  @JoinColumn(name = "user_id")
  //  private User user;


}
