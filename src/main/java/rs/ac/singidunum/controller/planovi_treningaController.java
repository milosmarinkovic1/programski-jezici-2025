package rs.ac.singidunum.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.singidunum.entity.planovi_treninga;
import rs.ac.singidunum.repo.planovi_treningaRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/api/trening")
@CrossOrigin
@RequiredArgsConstructor

public class planovi_treningaController {

    private planovi_treningaRepository repository;

    @GetMapping
    public List<planovi_treninga> getplanovi_treninga(){
        return repository.findAll();
    }





}
