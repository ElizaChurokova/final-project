package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.VisitType;
import kg.itacademy.finalproject.service.VisitTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/visit-type")
public class VisitTypeController {
    @Autowired
    private VisitTypeService visitTypeService;
    @GetMapping("/{id}")
    public VisitType findById(@PathVariable Long id){return visitTypeService.findById(id);}
    @PostMapping
    public VisitType save(@RequestBody VisitType visitType){return visitTypeService.save(visitType);}
}
