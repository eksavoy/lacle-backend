package com.lacle.backend.model;

import com.lacle.backend.model.audit.UserDateAudit;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rooms")
@Getter
@Setter
public class Room extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "number", unique = true, nullable = false)
    private Integer number;

    @OneToMany(
            mappedBy = "room",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    @Fetch(FetchMode.SELECT)
    private List<Lesson> lessons;
}
