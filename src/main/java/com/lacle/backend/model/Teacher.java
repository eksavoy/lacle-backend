package com.lacle.backend.model;

import com.lacle.backend.model.audit.UserDateAudit;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
@Getter
@Setter
public class Teacher extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToMany(
            mappedBy = "room",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    @Fetch(FetchMode.SELECT)
    private List<Lesson> lessons;

}
