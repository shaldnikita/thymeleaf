package ru.shaldnikita.thymeleaf.backend.entity;

import lombok.Data;
import ru.shaldnikita.thymeleaf.backend.entity.dict.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class SeedStarter extends AbstractEntity{

    @Temporal(value = TemporalType.DATE)
    private Date datePlanted;

    private boolean covered;
    private String type = Type.PLASTIC;

    @ElementCollection
    private List<String> features;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Row> rows = new ArrayList<Row>();
}
