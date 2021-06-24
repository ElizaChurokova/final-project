package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.DiseaseHistory;
import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.entity.VisitType;
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
    @Override
    public DiseaseHistory save(DiseaseHistory diseaseHistory) {
        return diseaseHistoryRepo.save(diseaseHistory);
    }

//    @Override
//    public DiseaseHistory save(DiseaseHistoryModel diseaseHistoryModel) {
//        DiseaseHistory diseaseHistory = new DiseaseHistory();
//        User user = userService.findById(diseaseHistoryModel.getUserId());
//        {
//            if(user == null) throw new IllegalArgumentException("Пользователь с ID " + diseaseHistoryModel.getUserId() + " не существует. ");
//            diseaseHistory.setUser(user);
//        }
//        VisitType visitType =
//        return null;
//    }

    @Override
    public DiseaseHistory findById(Long id) {
        return null;
    }
}
