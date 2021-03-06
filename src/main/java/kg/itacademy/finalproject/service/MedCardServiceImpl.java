package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.*;
import kg.itacademy.finalproject.model.MedCardModel;
import kg.itacademy.finalproject.repository.MedCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedCardServiceImpl implements MedCardService {
    @Autowired
    private MedCardRepo medCardRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private BloodGroupService bloodGroupService;
    @Autowired
    private AllergyService allergyService;
    @Autowired
    private ChronicDiseaseService chronicDiseaseService;
    @Autowired
    private VaccineService vaccineService;
    @Autowired
    private VisitService visitService;



    @Override
    public MedCard save(MedCardModel medCardModel) {
     MedCard medCard = new MedCard();

     User user = userService.findById(medCardModel.getUserId());{
         if(user == null)
             throw new IllegalArgumentException("Пользователь с ID " + medCardModel.getUserId() + " не существует");
             medCard.setUser(user);}

     medCard.setDateOfBirth(medCardModel.getDateOfBirth());

     medCard.setGender(medCardModel.getGender());

     medCard.setAddress(medCardModel.getAddress());

     BloodGroup bloodGroup = bloodGroupService.findById(medCardModel.getBloodGroupId()); {
         if(bloodGroup == null)
             throw new IllegalArgumentException("Группа крови с ID " + medCardModel.getBloodGroupId() + " не существует");
             medCard.setBloodGroup(bloodGroup);}

     Allergy allergy = allergyService.findById(medCardModel.getAllergyId());{
        if(allergy == null)
             throw new IllegalArgumentException("Аллергия с ID " + medCardModel.getAllergyId() + " не существует");
             List<Allergy> list = new ArrayList<>();
             medCard.setAllergies(list);}

     ChronicDisease chronicDisease = chronicDiseaseService.findById(medCardModel.getChronicDiseaseId()); {
         if(chronicDisease == null)
             throw new IllegalArgumentException("Хроническое заболевание с ID " + medCardModel.getChronicDiseaseId() + " не существует");
             List<ChronicDisease> list = new ArrayList<>();
             medCard.setChronicDiseases(list); }

     Vaccine vaccine = vaccineService.findById(medCardModel.getVaccineId());{
         if(vaccine == null)
             throw new IllegalArgumentException("Полученная вакцина с ID " + medCardModel.getVaccineId() + " не существует");
             List<Vaccine> list = new ArrayList<>();
             medCard.setVaccines(list); }



        return medCardRepo.save(medCard);
    }

    @Override
    public MedCard findById(Long id) {
        return medCardRepo.findById(id).orElse(null);
    }

    @Override
    public List<MedCard> findAll() {
        System.out.println("Дайте медкарты для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return medCardRepo.findAll();
    }

    @Override
    public MedCard findByUser_Id(Long userId) {
        return medCardRepo.findByUser_Id(userId);
    }


}
