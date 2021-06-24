package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.*;
import kg.itacademy.finalproject.model.DiseaseHistoryModel;
import kg.itacademy.finalproject.repository.DiseaseHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiseaseHistoryServiceImpl implements DiseaseHistoryService {
    @Autowired
    private DiseaseHistoryRepo diseaseHistoryRepo;
    @Autowired
    private DiseaseHistoryService diseaseHistoryService;
    @Autowired
    private UserService userService;
    @Autowired
    private VisitTypeService visitTypeService;
    @Autowired
    private DirectionService directionService;
    @Autowired
    private MedPersonalDetailsService medPersonalDetailsService;
    @Autowired
    private LabtestService labtestService;


    @Override
    public DiseaseHistory save(DiseaseHistoryModel diseaseHistoryModel) {
        DiseaseHistory diseaseHistory = new DiseaseHistory();
        User user = userService.findById(diseaseHistoryModel.getUserId());
        {
            if(user == null) throw new IllegalArgumentException("Пользователь с ID " + diseaseHistoryModel.getUserId() + " не существует. ");
            diseaseHistory.setUser(user);
        }
        VisitType visitType = visitTypeService.findById(diseaseHistoryModel.getVisitTypeId()); {
            if(visitType == null) throw new IllegalArgumentException("Тип визита с ID " + diseaseHistoryModel.getVisitTypeId() + " не существует. ");
            diseaseHistory.setVisitType(visitType);
        }

        diseaseHistory.setDateOfVisit(diseaseHistoryModel.getDateOfVisit());

        Direction direction = directionService.findById(diseaseHistoryModel.getDirectionId());{
            if(direction == null) throw new IllegalArgumentException("Направление с ID " + diseaseHistoryModel.getDirectionId() + " не существует.");
            diseaseHistory.setDirection(direction);
        }

        MedPersonalDetails medPersonalDetails = medPersonalDetailsService.findByMedPersonalDetailsOneId(diseaseHistoryModel.getMedPersonalId());
        {
            if(medPersonalDetails == null) throw  new IllegalArgumentException("Мед персонал с ID " + diseaseHistoryModel.getMedPersonalId() + " не сушествует");
            diseaseHistory.setMedPersonalDetails(medPersonalDetails);
        }

        diseaseHistory.setComplaintDescription(diseaseHistoryModel.getComplaintDescription());

        diseaseHistory.setDoctorExamDesciption(diseaseHistoryModel.getDoctorExamDescription());

        diseaseHistory.setDiagnosis(diseaseHistoryModel.getDiagnosis());








        return null;
    }

    @Override
    public DiseaseHistory findById(Long id) {
        return null;
    }
}
