package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.MedInstitutionType;
import kg.itacademy.finalproject.service.MedInstitutionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medType")
public class MedInstitutionTypeController {
    @Autowired
    private MedInstitutionTypeService medInstitutionTypeService;

    @GetMapping("/{id}")
    public MedInstitutionType findById(@PathVariable Long id){
        return medInstitutionTypeService.findById(id);
    }
    @PostMapping
    public MedInstitutionType save(@RequestBody MedInstitutionType medInstitutionType){
        return medInstitutionTypeService.save(medInstitutionType);
    }
    @GetMapping("/find-all")
    public List<MedInstitutionType> findAll(){return medInstitutionTypeService.findAll();}
}
