package com.diseases.diseases.Services;

import java.util.List;
import java.util.Optional;

import com.diseases.diseases.Models.Disease;
import com.diseases.diseases.Repositories.DiseaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DiseaseService {

    @Autowired
    private DiseaseRepository diseaseRepository;

    public Optional<Disease> getDisease(double id) {
        return diseaseRepository.findById(id);
    }

    public List<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }

    public List<Disease> searchDisease(String name) {
        return diseaseRepository.searchDisease(name);
    }

}
