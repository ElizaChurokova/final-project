package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.MedPersonalDetails;
import kg.itacademy.finalproject.service.MedPersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/med-personal-details")
public class MedPersonalDetailsController {
    @Autowired
    private MedPersonalDetailsService medPersonalDetailsService;
    @GetMapping("/{id}")
    public MedPersonalDetails findByMedPersonalDetailsOneId(@PathVariable Long id){
        return (MedPersonalDetails) medPersonalDetailsService.findByMedPersonalDetailsOneId(id);}
    @GetMapping("/{id}")
    public MedPersonalDetails findByMedPersonalDetailsTwoId(@PathVariable Long id){
        return (MedPersonalDetails) medPersonalDetailsService.findByMedPersonalDetailsTwoId(id);}
    @PostMapping
    public MedPersonalDetails save(@RequestBody MedPersonalDetails medPersonalDetails){
        return medPersonalDetailsService.save(medPersonalDetails);
    }




}
