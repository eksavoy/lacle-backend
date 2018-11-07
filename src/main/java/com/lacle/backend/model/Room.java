package com.lacle.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
@Getter
@Setter
public class Room extends DefaultId {

    @Column(name = "NUMBER", unique = true, nullable = false)
    private Integer number;
}
