package ru.shaldnikita.thymeleaf.backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@EntityListeners(value = EntityCreateUpdateDateListener.class)
public class AbstractEntity {

    @Id
    @GeneratedValue
    private long id;
    @Version
    private int version;

    private LocalDateTime lastUpdatedDate;
    private LocalDateTime createdDate;

}
