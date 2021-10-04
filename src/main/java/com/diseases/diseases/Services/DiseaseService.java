package com.diseases.diseases.Services;

import java.util.List;
import java.util.Optional;

import com.diseases.diseases.Exceptions.ApiException;
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
        Optional<Disease> oneDisease = diseaseRepository.findById(id);
        if (oneDisease.isEmpty()) {
            throw new ApiException("disease not found");
        }
        return oneDisease;

    }

    public List<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }

    public List<Disease> searchDisease(String name) {
        return diseaseRepository.searchDisease(name);
    }

}
