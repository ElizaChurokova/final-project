package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.Visit;
import kg.itacademy.finalproject.model.VisitModel;
import kg.itacademy.finalproject.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visit")
public class VisitController {
    @Autowired
    private VisitService visitService;
    @GetMapping("/{id}")
    public Visit findById(@PathVariable Long id){return visitService.findById(id);}
    @PostMapping
    public Visit save(@RequestBody VisitModel visitModel){return visitService.save(visitModel);}
    @GetMapping
    public List<Visit>findAll(){return visitService.findAll();}

}
