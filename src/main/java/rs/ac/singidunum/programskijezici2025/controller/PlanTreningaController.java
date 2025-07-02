package rs.ac.singidunum.programskijezici2025.controller;

import rs.ac.singidunum.programskijezici2025.model.PlanTreninga;
import rs.ac.singidunum.programskijezici2025.repository.PlanTreningaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // vraca nam json odgovore umesto html view-a
@RequestMapping("/api/planovi") //putanjA
public class PlanTreningaController {

    @Autowired
    private PlanTreningaRepository planRepo;

    @GetMapping
    public List<PlanTreninga> getAll() {
        return planRepo.findAll();
    }

    @PostMapping  // prima json
    public PlanTreninga create(@RequestBody PlanTreninga plan) {
        return planRepo.save(plan);
    }

    @PutMapping("/{id}")
    public PlanTreninga update(@PathVariable Long id, @RequestBody PlanTreninga details) {
        PlanTreninga plan = planRepo.findById(id).orElseThrow();
        plan.setTrenerId(details.getTrenerId());
        plan.setVezbaId(details.getVezbaId());
        plan.setPauza(details.getPauza());
        plan.setVremeNastanka(details.getVremeNastanka());
        return planRepo.save(plan);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        planRepo.deleteById(id);
    }

    @GetMapping("/{id}")
    public PlanTreninga getOne(@PathVariable Long id) {
        return planRepo.findById(id).orElseThrow();
    }

}
