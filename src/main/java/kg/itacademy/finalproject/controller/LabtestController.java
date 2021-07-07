package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.Labtest;
import kg.itacademy.finalproject.service.LabtestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/labtest")
public class LabtestController {
    @Autowired
    private LabtestService labtestService;
    @GetMapping("/{id}")
    public Labtest findById(@PathVariable Long id){return labtestService.findById(id);}
    @PostMapping
    public Labtest save(@RequestBody Labtest labtest){return labtestService.save(labtest);}
    @GetMapping("/find-all")
    public List<Labtest> findAll(){return labtestService.findAll();}
}
