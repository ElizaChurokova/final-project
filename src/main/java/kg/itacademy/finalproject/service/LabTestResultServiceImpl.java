package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.LabTestResult;
import kg.itacademy.finalproject.entity.MedInstitution;
import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.model.LabTestResultModel;
import kg.itacademy.finalproject.repository.LabTestResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabTestResultServiceImpl implements LabTestResultService {
    @Autowired
    private LabTestResultRepo labTestResultRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private MedInstitutionService medInstitutionService;
    @Override
    public LabTestResult save(LabTestResult labTestResult) {
        return labTestResultRepo.save(labTestResult);
    }

    @Override
    public LabTestResult save(LabTestResultModel labTestResultModel) {
        LabTestResult labTestResult = new LabTestResult();
        labTestResult.setResultDescription(labTestResultModel.getResultDescription());

        MedInstitution medInstitution = medInstitutionService.findById(labTestResultModel.getMedInstitutionId());
        {
            if(medInstitution == null) throw new IllegalArgumentException("Мед учреждение с ID " + labTestResultModel.getMedInstitutionId() + "не существует");
            labTestResult.setMedInstitution(medInstitution);
        }

        User user = userService.findById(labTestResultModel.getUserId());
        {
            if(user == null) throw new IllegalArgumentException("Пользователь с ID " + labTestResultModel.getUserId() + " не существует. ");
            labTestResult.setUser(user);
        }
        return labTestResultRepo.save(labTestResult);
    }

    @Override
    public LabTestResult findById(Long id) {
        return labTestResultRepo.findById(id).orElse(null);
    }

    @Override
    public List<LabTestResult> findAll() {
        System.out.println("Дайте результаты всех лабораторных анализов для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return labTestResultRepo.findAll();
    }
}
