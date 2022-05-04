package eval3.KrachAchraf.exams.controller;

import eval3.KrachAchraf.exams.model.Sujet;
import eval3.KrachAchraf.exams.repository.SujetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/sujets")
public class SujetControllerMvc {

    @Autowired
    private SujetRepository sujetRepository;

    @GetMapping("/liste")
    public String findAll(Model model) {
        model.addAttribute("sujets", sujetRepository.findAll());
        return "sujets/liste";
    }

    @PostMapping("/ajout")
    public String save(@ModelAttribute("sujet") Sujet sujet) {
        sujetRepository.save(sujet);
        return "redirect:/sujets";
    }
}
