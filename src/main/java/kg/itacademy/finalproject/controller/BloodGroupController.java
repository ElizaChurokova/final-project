package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.BloodGroup;
import kg.itacademy.finalproject.service.BloodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blood-group")
public class BloodGroupController {
    @Autowired
    private BloodGroupService bloodGroupService;
    @GetMapping("/{id}")
    public BloodGroup findById(@PathVariable Long id){return bloodGroupService.findById(id);}
    @PostMapping
    public BloodGroup save(@RequestBody BloodGroup bloodGroup){return bloodGroupService.save(bloodGroup);}
}
