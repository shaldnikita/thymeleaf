package ru.shaldnikita.thymeleaf.backend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@Entity
public class Row extends AbstractEntity{

    @OneToOne
    private Variety variety;
    private int seedsPerCell;
}
