package ru.shaldnikita.thymeleaf.backend.entity;


import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class EntityCreateUpdateDateListener {

    @PreUpdate
    public void setCreatedDate(AbstractEntity abstractEntity) {
        abstractEntity.setCreatedDate(LocalDateTime.now());
    }

    @PreUpdate
    @PrePersist
    public void setLastUpdatedDate(AbstractEntity abstractEntity) {
        abstractEntity.setLastUpdatedDate(LocalDateTime.now());
    }

}
