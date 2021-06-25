package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.*;
import kg.itacademy.finalproject.model.InitialVisitModel;
import kg.itacademy.finalproject.repository.InitialVisitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InitialVisitServiceImpl implements InitialVisitService {
    @Autowired
    private InitialVisitRepo initialVisitRepo;
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


    @Override
    public InitialVisit save(InitialVisitModel initialVisitModel) {
        InitialVisit initialVisit = new InitialVisit();
        User user = userService.findById(initialVisitModel.getUserId());
        {
            if (user == null)
                throw new IllegalArgumentException("Пользователь с ID " + initialVisitModel.getUserId() + " не существует. ");
            initialVisit.setUser(user);
        }
        VisitType visitType = visitTypeService.findById(initialVisitModel.getVisitTypeId());
        {
            if (visitType == null)
                throw new IllegalArgumentException("Тип визита с ID " + initialVisitModel.getVisitTypeId() + " не существует. ");
            initialVisit.setVisitType(visitType);
        }

        initialVisit.setDateOfVisit(initialVisitModel.getDateOfVisit());

        Direction direction = directionService.findById(initialVisitModel.getDirectionId());
        {
            if (direction == null)
                throw new IllegalArgumentException("Направление с ID " + initialVisitModel.getDirectionId() + " не существует.");
            initialVisit.setDirection(direction);
        }

        MedPersonalDetails medPersonalDetails = medPersonalDetailsService.findByMedPersonalDetailsId(initialVisitModel.getMedPersonalId());
        {
            if (medPersonalDetails == null)
                throw new IllegalArgumentException("Мед персонал с ID " + initialVisitModel.getMedPersonalId() + " не сушествует");
            initialVisit.setMedPersonalDetails(medPersonalDetails);
        }

        initialVisit.setComplaintDescription(initialVisitModel.getComplaintDescription());

        initialVisit.setDoctorExamDescription(initialVisitModel.getDoctorExamDescription());

        initialVisit.setDiagnosis(initialVisitModel.getDiagnosis());

        Labtest labtest = labtestService.findById(initialVisitModel.getTodoLabTestId());
        {
            if(labtest == null)
                throw new IllegalArgumentException("Лабораторный анализ с ID " + initialVisitModel.getTodoLabTestId() + "не существует");
            List<Labtest> list = new ArrayList<>();
            initialVisit.setLabtest(list);
        }

        initialVisit.setTodoHavePills(initialVisitModel.getTodoHavePills());

        MedInstitution medInstitution = medInstitutionService.findById(initialVisitModel.getMedInstitutionId());
        {
            if(medInstitution == null)
                throw new IllegalArgumentException("Медицинское учреждение с ID "  + initialVisitModel.getMedInstitutionId() + " не существует.");
            initialVisit.setMedInstitution(medInstitution);
        }
        return initialVisitRepo.save(initialVisit);
    }

    @Override
    public InitialVisit findById(Long id) {
        return initialVisitRepo.findById(id).orElse(null);
    }
}
