package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.MedPersonalDetails;
import kg.itacademy.finalproject.model.MedPersonalDetailsModel;
import kg.itacademy.finalproject.service.MedPersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/med-personal-details")
public class MedPersonalDetailsController {
    @Autowired
    private MedPersonalDetailsService medPersonalDetailsService;
    @GetMapping("/{id}")
    public MedPersonalDetails findByMedPersonalDetailsId(@PathVariable Long id){
        return medPersonalDetailsService.findByMedPersonalDetailsId(id);}
    @PostMapping
    public MedPersonalDetails save(@RequestBody MedPersonalDetailsModel medPersonalDetailsModel){
        return medPersonalDetailsService.save(medPersonalDetailsModel);
    }
    @GetMapping("/find-all")
    public List<MedPersonalDetails>findAll(){return medPersonalDetailsService.findAll();}




}
