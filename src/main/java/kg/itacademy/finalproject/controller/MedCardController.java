package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.MedCard;
import kg.itacademy.finalproject.model.MedCardModel;
import kg.itacademy.finalproject.service.MedCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/med-card")
public class MedCardController {
    @Autowired
    private MedCardService medCardService;
    @GetMapping("/{id}")
    public MedCard findById(@PathVariable Long id) {return medCardService.findById(id);}
    @PostMapping
    public MedCard save(@RequestBody MedCardModel medCardModel) {return medCardService.save(medCardModel);}
    @GetMapping("/find-all")
    public List<MedCard>findAll(){return medCardService.findAll();}
    @GetMapping("/find-by-user-id/{id}")
    public MedCard findByUser_Id(@PathVariable Long id){return medCardService.findByUser_Id(id);}

}
