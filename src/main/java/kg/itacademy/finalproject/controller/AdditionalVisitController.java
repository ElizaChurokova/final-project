package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.AdditionalVisit;
import kg.itacademy.finalproject.model.AdditionalVisitModel;
import kg.itacademy.finalproject.service.AdditionalVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/additional-visit")
public class AdditionalVisitController {
    @Autowired
    private AdditionalVisitService additionalVisitService;
    @GetMapping("/{id}")
    public AdditionalVisit getById(@PathVariable Long id) {return additionalVisitService.findById(id);}
    @PostMapping
    public AdditionalVisit save(@RequestBody AdditionalVisitModel additionalVisitModel){return additionalVisitService.save(additionalVisitModel);}
}
