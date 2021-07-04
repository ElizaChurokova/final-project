package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.LabTestResult;
import kg.itacademy.finalproject.model.LabTestResultModel;
import kg.itacademy.finalproject.model.UserCreateModel;

import java.util.List;

public interface LabTestResultService {
    LabTestResult save(LabTestResult labTestResult);
    LabTestResult save(LabTestResultModel labTestResultModel);
    LabTestResult findById(Long id);
    List<LabTestResult> findAll();

}
