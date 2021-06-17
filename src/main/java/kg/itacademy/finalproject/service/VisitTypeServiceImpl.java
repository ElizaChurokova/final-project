package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.VisitType;
import kg.itacademy.finalproject.repository.VisitTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitTypeServiceImpl implements VisitTypeService {
    @Autowired
    private VisitTypeRepo visitTypeRepo;
    @Override
    public VisitType save(VisitType visitType) {
        return visitTypeRepo.save(visitType);
    }

    @Override
    public VisitType findById(Long id) {
        return visitTypeRepo.findById(id).orElse(null);
    }
}
