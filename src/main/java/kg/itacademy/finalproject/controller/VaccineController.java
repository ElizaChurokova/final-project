package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.Vaccine;
import kg.itacademy.finalproject.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vaccine")
public class VaccineController {
    @Autowired
    private VaccineService vaccineService;
    @GetMapping("/{id}")
    public Vaccine findById(@PathVariable Long id) {
        return vaccineService.findById(id); }
    @PostMapping
    public Vaccine save(@RequestBody Vaccine vaccine){
        return vaccineService.save(vaccine);
    }

}
