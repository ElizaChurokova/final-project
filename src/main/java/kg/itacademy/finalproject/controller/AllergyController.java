package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.Allergy;
import kg.itacademy.finalproject.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/allergy")
public class AllergyController {
    @Autowired
    private AllergyService allergyService;
    @GetMapping("/{id}")
    public Allergy findById(@PathVariable Long id){return allergyService.findById(id);}
    @PostMapping
    public Allergy save(@RequestBody Allergy allergy){return allergyService.save(allergy);}
}
