package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.InitialVisit;
import kg.itacademy.finalproject.model.InitialVisitModel;
import kg.itacademy.finalproject.service.InitialVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/initial-visit")
public class InitialVisitController {
    @Autowired
    private InitialVisitService initialVisitService;
    @GetMapping("/{id}")
    public InitialVisit findById(@PathVariable Long id){return initialVisitService.findById(id);}
    @PostMapping
    public InitialVisit save(@RequestBody InitialVisitModel initialVisitModel){return initialVisitService.save(initialVisitModel);}

}
