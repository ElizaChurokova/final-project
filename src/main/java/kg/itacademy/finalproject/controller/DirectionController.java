package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.Direction;
import kg.itacademy.finalproject.service.DirectionService;
import kg.itacademy.finalproject.service.DirectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/direction")
public class DirectionController {
    @Autowired
    private DirectionService directionService;
    @GetMapping("/{id}")
    public Direction findById(@PathVariable Long id){ return directionService.findById(id); }
    @PostMapping
    public Direction save(@RequestBody Direction direction){ return directionService.save(direction);}
}
