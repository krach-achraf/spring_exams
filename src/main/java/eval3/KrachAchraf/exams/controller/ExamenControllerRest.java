package eval3.KrachAchraf.exams.controller;

import eval3.KrachAchraf.exams.model.Examen;
import eval3.KrachAchraf.exams.repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examens")
public class ExamenControllerRest {

    @Autowired
    private ExamenRepository examenRepository;

    @GetMapping
    public List<Examen> findAll() {
        return examenRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Examen examen) {
        examenRepository.save(examen);
    }
}
