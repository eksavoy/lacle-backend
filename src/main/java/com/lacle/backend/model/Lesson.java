package com.lacle.backend.model;

import com.lacle.backend.model.audit.UserDateAudit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@Table(name = "lessons")
@Getter
@Setter
public class Lesson extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Instant startDate;

    @NotNull
    private Instant endDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    public Lesson() {
    }

    public Lesson(@NotNull Instant startDate, @NotNull Instant endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
