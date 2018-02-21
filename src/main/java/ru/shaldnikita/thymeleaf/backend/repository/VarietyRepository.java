package ru.shaldnikita.thymeleaf.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shaldnikita.thymeleaf.backend.entity.Variety;

public interface VarietyRepository extends JpaRepository<Variety, Long> {
}
