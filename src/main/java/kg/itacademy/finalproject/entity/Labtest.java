package kg.itacademy.finalproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "labtest")
public class Labtest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
}
