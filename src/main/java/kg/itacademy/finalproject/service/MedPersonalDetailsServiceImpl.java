package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Direction;
import kg.itacademy.finalproject.entity.MedInstitution;
import kg.itacademy.finalproject.entity.MedPersonalDetails;
import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.model.MedPersonalDetailsModel;
import kg.itacademy.finalproject.repository.MedPersonalDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MedPersonalDetailsServiceImpl implements MedPersonalDetailsService {
    @Autowired
    private MedPersonalDetailsRepo medPersonalDetailsRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private DirectionService directionService;
    @Autowired
    private MedInstitutionService medInstitutionService;

    @Override
    public MedPersonalDetails save(MedPersonalDetailsModel medPersonalDetailsModel) {
        MedPersonalDetails medPersonalDetails = new MedPersonalDetails();
        User user = userService.findById(medPersonalDetailsModel.getUserId());{
            if(user == null) throw new IllegalArgumentException("Пользователь с ID " + medPersonalDetailsModel.getUserId() + " не существует");
            medPersonalDetails.setUser(user);
        }

        Direction direction = directionService.findById(medPersonalDetailsModel.getDirectionId());{
            if(direction == null) throw new IllegalArgumentException("Направление с ID " + medPersonalDetailsModel.getDirectionId() + " не существует");
            medPersonalDetails.setDirection(direction);
        }

        MedInstitution medInstitution = medInstitutionService.findById(medPersonalDetailsModel.getMedInstitutionId()); {
            if(medInstitution == null) throw new IllegalArgumentException("Медицинское учреждение с ID " + medPersonalDetailsModel.getMedInstitutionId() + " не существует");
            List<MedInstitution> medInstitutions = new ArrayList<>();
            medPersonalDetails.setMedInstitutions(medInstitutions);
        }

        return medPersonalDetailsRepo.save(medPersonalDetails);
    }

    @Override
    public MedPersonalDetails findByMedPersonalDetailsId(Long id) {
        return medPersonalDetailsRepo.findById(id).orElse(null);
    }

    @Override
    public List<MedPersonalDetails> findAll() {
        System.out.println("Дайте список мед работников для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return medPersonalDetailsRepo.findAll();
    }

}
