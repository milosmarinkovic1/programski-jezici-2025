package rs.ac.singidunum.programskijezici2025.controller;

import rs.ac.singidunum.programskijezici2025.model.Trener;
import rs.ac.singidunum.programskijezici2025.repository.TrenerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/treneri")
public class TrenerController {

    @Autowired
    private TrenerRepository trenerRepo;

    @GetMapping
    public List<Trener> getAll() {
        return trenerRepo.findAll();
    }

    @PostMapping
    public Trener create(@RequestBody Trener trener) {
        return trenerRepo.save(trener);
    }

    @PutMapping("/{id}")
    public Trener update(@PathVariable Long id, @RequestBody Trener details) {
        Trener trener = trenerRepo.findById(id).orElseThrow();
        trener.setIme(details.getIme());
        trener.setPrezime(details.getPrezime());
        trener.setSpecijalnost(details.getSpecijalnost());
        trener.setKontakt(details.getKontakt());
        return trenerRepo.save(trener);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        trenerRepo.deleteById(id);
    }

    @GetMapping("/{id}")
    public Trener getOne(@PathVariable Long id) {
        return trenerRepo.findById(id).orElseThrow();
    }

}
