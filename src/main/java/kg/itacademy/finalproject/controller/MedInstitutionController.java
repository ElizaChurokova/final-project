package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.MedInstitution;
import kg.itacademy.finalproject.model.MedInstitutionModel;
import kg.itacademy.finalproject.service.MedInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/med-institution")
public class MedInstitutionController {
    @Autowired
    private MedInstitutionService medInstitutionService;
    @GetMapping("/{id}")
    public MedInstitution findById(@PathVariable Long id){return medInstitutionService.findById(id);}
    @PostMapping
    public MedInstitution save(@RequestBody MedInstitutionModel medInstitutionModel) {
        return medInstitutionService.save(medInstitutionModel);}
}
