package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Vaccine;
import kg.itacademy.finalproject.repository.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineServiceImpl implements VaccineService {
    @Autowired
    private VaccineRepo vaccineRepo;
    @Override
    public Vaccine save(Vaccine vaccine) {
        return vaccineRepo.save(vaccine);
    }

    @Override
    public Vaccine findById(Long id) {
        return vaccineRepo.findById(id).orElse(null);
    }
}
