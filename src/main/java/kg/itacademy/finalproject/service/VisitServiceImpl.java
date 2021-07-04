package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.*;
import kg.itacademy.finalproject.model.VisitModel;
import kg.itacademy.finalproject.repository.VisitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisitServiceImpl implements VisitService {
    @Autowired
    private VisitRepo visitRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private DirectionService directionService;
    @Autowired
    private MedPersonalDetailsService medPersonalDetailsService;
    @Autowired
    private MedInstitutionService medInstitutionService;
    @Autowired
    private LabtestService labtestService;


    @Override
    public Visit save(VisitModel visitModel) {
        Visit visit = new Visit();
        User user = userService.findById(visitModel.getUserId());
        {
            if (user == null)
                throw new IllegalArgumentException("Пользователь с ID " + visitModel.getUserId() + " не существует. ");
            visit.setUser(user);
        }

        visit.setDateOfVisit(visitModel.getDateOfVisit());

        Direction direction = directionService.findById(visitModel.getDirectionId());
        {
            if (direction == null)
                throw new IllegalArgumentException("Направление с ID " + visitModel.getDirectionId() + " не существует.");
            visit.setDirection(direction);
        }

        MedPersonalDetails medPersonalDetails = medPersonalDetailsService.findByMedPersonalDetailsId(visitModel.getMedPersonalId());
        {
            if (medPersonalDetails == null)
                throw new IllegalArgumentException("Мед персонал с ID " + visitModel.getMedPersonalId() + " не сушествует");
            visit.setMedPersonalDetails(medPersonalDetails);
        }

        visit.setComplaintDescription(visitModel.getComplaintDescription());

        visit.setDoctorExamDescription(visitModel.getDoctorExamDescription());

        visit.setDiagnosis(visitModel.getDiagnosis());

        Labtest labtest = labtestService.findById(visitModel.getTodoLabTestId());
        {
            if(labtest == null)
                throw new IllegalArgumentException("Лабораторный анализ с ID " + visitModel.getTodoLabTestId() + "не существует");
            List<Labtest> list = new ArrayList<>();
            visit.setLabtest(list);
        }

        visit.setTodoHavePills(visitModel.getTodoHavePills());

        MedInstitution medInstitution = medInstitutionService.findById(visitModel.getMedInstitutionId());
        {
            if(medInstitution == null)
                throw new IllegalArgumentException("Медицинское учреждение с ID "  + visitModel.getMedInstitutionId() + " не существует.");
            visit.setMedInstitution(medInstitution);
        }
        return visitRepo.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return visitRepo.findById(id).orElse(null);
    }

    @Override
    public List<Visit> findAll() {
        return visitRepo.findAll();
    }
}
