package ru.shaldnikita.thymeleaf.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shaldnikita.thymeleaf.backend.entity.SeedStarter;

public interface SeedStarterRepository extends JpaRepository<SeedStarter, Long> {
}
