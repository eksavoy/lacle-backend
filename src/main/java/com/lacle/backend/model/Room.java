package com.lacle.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ROOMS")
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "NUMBER", unique = true, nullable = false)
    private Integer number;
}
