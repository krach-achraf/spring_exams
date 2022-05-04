package eval3.KrachAchraf.exams.controller;

import eval3.KrachAchraf.exams.model.Sujet;
import eval3.KrachAchraf.exams.repository.SujetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sujets")
public class SujetControllerRest {

    @Autowired
    private SujetRepository sujetRepository;

    @GetMapping
    public List<Sujet> findAll() {
        return sujetRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Sujet sujet) {
        sujetRepository.save(sujet);
    }
}
