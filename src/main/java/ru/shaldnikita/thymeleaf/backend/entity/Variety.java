package ru.shaldnikita.thymeleaf.backend.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Variety extends AbstractEntity {
    private String name;
}
