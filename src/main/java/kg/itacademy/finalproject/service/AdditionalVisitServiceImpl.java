package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.*;
import kg.itacademy.finalproject.model.AdditionalVisitModel;
import kg.itacademy.finalproject.repository.AdditionalVisitRepo;
import kg.itacademy.finalproject.repository.InitialVisitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdditionalVisitServiceImpl implements AdditionalVisitService {
    @Autowired
    private AdditionalVisitRepo additionalVisitRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private VisitTypeService visitTypeService;
    @Autowired
    private DirectionService directionService;
    @Autowired
    private MedPersonalDetailsService medPersonalDetailsService;
    @Autowired
    private MedInstitutionService medInstitutionService;
    @Autowired
    private LabtestService labtestService;
    @Autowired
    private InitialVisitService initialVisitService;
    @Autowired
    private LabTestResultService labTestResultService;

    @Override
    public AdditionalVisit save(AdditionalVisitModel additionalVisitModel) {
        AdditionalVisit additionalVisit = new AdditionalVisit();

        User user = userService.findById(additionalVisitModel.getUserId());
        {
            if (user == null)
                throw new IllegalArgumentException("Пользователь с ID " + additionalVisitModel.getUserId() + " не существует. ");
            additionalVisit.setUser(user);
        }
        VisitType visitType = visitTypeService.findById(additionalVisitModel.getVisitTypeId());
        {
            if (visitType == null)
                throw new IllegalArgumentException("Тип визита с ID " + additionalVisitModel.getVisitTypeId() + " не существует. ");
            additionalVisit.setVisitType(visitType);
        }

        additionalVisit.setDateOfVisit(additionalVisit.getDateOfVisit());

        Direction direction = directionService.findById(additionalVisitModel.getDirectionId());
        {
            if (direction == null)
                throw new IllegalArgumentException("Направление с ID " + additionalVisitModel.getDirectionId() + " не существует.");
            additionalVisit.setDirection(direction);
        }

        MedPersonalDetails medPersonalDetails = medPersonalDetailsService.findByMedPersonalDetailsOneId(additionalVisitModel.getMedPersonalId());
        {
            if (medPersonalDetails == null)
                throw new IllegalArgumentException("Мед персонал с ID " + additionalVisitModel.getMedPersonalId() + " не сушествует");
            additionalVisit.setMedPersonalDetails(medPersonalDetails);
        }

        InitialVisit initialVisit = initialVisitService.findById(additionalVisitModel.getInitialVisitId());
        {
            if (initialVisit == null)
                throw new IllegalArgumentException("Первичный визит с ID " + additionalVisitModel.getInitialVisitId() + "не существует");
            additionalVisit.setInitialVisit(initialVisit);
        }

        LabTestResult labTestResult = labTestResultService.findById(additionalVisitModel.getLabtestResultId());
        {
            if (labTestResult == null)
                throw new IllegalArgumentException("Результат лабораторного анализа с ID " + additionalVisitModel.getLabtestResultId() + " не существует");
            additionalVisit.setLabTestResult(labTestResult);
        }

        additionalVisit.setDoctorExamDescription(additionalVisitModel.getDoctorExamDescription());

        additionalVisit.setDiagnosis(additionalVisitModel.getDiagnosis());

        Labtest labtest = labtestService.findById(additionalVisitModel.getTodoLabTestId());
        {
            if(labtest == null)
                throw new IllegalArgumentException("Лабораторный анализ с ID " + additionalVisitModel.getTodoLabTestId() + "не существует");
            List<Labtest> list = new ArrayList<>();
            additionalVisit.setLabtest(list);
        }

        additionalVisit.setTodoHavePills(additionalVisitModel.getTodoHavePills());

        MedInstitution medInstitution = medInstitutionService.findById(additionalVisitModel.getMedInstitutionId());
        {
            if(medInstitution == null)
                throw new IllegalArgumentException("Медицинское учреждение с ID "  + additionalVisitModel.getMedInstitutionId() + " не существует.");
            additionalVisit.setMedInstitution(medInstitution);
        }
        return additionalVisitRepo.save(additionalVisit);
    }

    @Override
    public AdditionalVisit findById(Long id) {
        return additionalVisitRepo.findById(id).orElse(null);
    }
}
