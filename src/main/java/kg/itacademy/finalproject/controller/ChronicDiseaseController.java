package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.ChronicDisease;
import kg.itacademy.finalproject.service.ChronicDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chronic-disease")
public class ChronicDiseaseController {
    @Autowired
    private ChronicDiseaseService chronicDiseaseService;
    @GetMapping("/{id}")
    public ChronicDisease findById(@PathVariable Long id){return chronicDiseaseService.findById(id);}
    @PostMapping
    public ChronicDisease save(@RequestBody ChronicDisease chronicDisease){return chronicDiseaseService.save(chronicDisease);}
}
