package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.LabTestResult;
import kg.itacademy.finalproject.model.LabTestResultModel;
import kg.itacademy.finalproject.service.LabTestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lab-test-result")
public class LabTestResultController {
    @Autowired
    private LabTestResultService labTestResultService;
    @GetMapping("/{id}")
    public LabTestResult findById(@PathVariable Long id){return labTestResultService.findById(id);}
    @PostMapping
    public LabTestResult save(@RequestBody LabTestResultModel labTestResultModel){return labTestResultService.save(labTestResultModel);}

}
