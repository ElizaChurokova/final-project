package kg.itacademy.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "login", unique = true, nullable = false)
    private String login;
    @Column(name = "password", nullable = false, unique = true)
    private String password;
    @Column(name = "status")
    private Integer status;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    //
    @ManyToOne
    @JoinColumn(name = "user_role_id")
    private UserRole userRole;


}
