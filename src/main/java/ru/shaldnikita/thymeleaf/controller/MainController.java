package ru.shaldnikita.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.shaldnikita.thymeleaf.backend.entity.SeedStarter;
import ru.shaldnikita.thymeleaf.backend.entity.Variety;
import ru.shaldnikita.thymeleaf.backend.entity.dict.Feature;
import ru.shaldnikita.thymeleaf.backend.entity.dict.Type;
import ru.shaldnikita.thymeleaf.backend.repository.SeedStarterRepository;
import ru.shaldnikita.thymeleaf.backend.repository.VarietyRepository;
import ru.shaldnikita.thymeleaf.utils.ReflectionUtils;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private VarietyRepository varietyRepository;

    @Autowired
    private SeedStarterRepository seedStarterRepository;

    @ModelAttribute("allTypes")
    public List<String> populateTypes() {
        return ReflectionUtils.getAllStringConstants(Type.class);
    }

    @ModelAttribute("allFeatures")
    public List<String> populateFeatures() {
        return ReflectionUtils.getAllStringConstants(Feature.class);
    }

    @ModelAttribute("allVarieties")
    public List<Variety> populateVarieties() {
        return varietyRepository.findAll();
    }

    @ModelAttribute("allSeedStarters")
    public List<SeedStarter> populateSeedStarters() {
        return seedStarterRepository.findAll();
    }
}
