package rs.ac.singidunum.programskijezici2025.controller;

import rs.ac.singidunum.programskijezici2025.model.Vezba;
import rs.ac.singidunum.programskijezici2025.repository.VezbaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vezbe")
public class VezbaController {

    @Autowired
    private VezbaRepository vezbaRepo;

    @GetMapping
    public List<Vezba> getAll() {
        return vezbaRepo.findAll();
    }

    @PostMapping
    public Vezba create(@RequestBody Vezba vezba) {
        return vezbaRepo.save(vezba);
    }

    @PutMapping("/{id}")
    public Vezba update(@PathVariable Long id, @RequestBody Vezba details) {
        Vezba vezba = vezbaRepo.findById(id).orElseThrow();
        vezba.setNaziv(details.getNaziv());
        vezba.setOpis(details.getOpis());
        vezba.setTrajanje(details.getTrajanje());
        return vezbaRepo.save(vezba);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        vezbaRepo.deleteById(id);
    }

    @GetMapping("/{id}")
    public Vezba getOne(@PathVariable Long id) {
        return vezbaRepo.findById(id).orElseThrow();
    }

}
