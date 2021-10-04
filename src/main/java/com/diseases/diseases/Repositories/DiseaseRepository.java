package com.diseases.diseases.Repositories;

import java.util.List;

import com.diseases.diseases.Models.Disease;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, Double> {

    @Query(value = "SELECT * FROM diseases WHERE name LIKE CONCAT('%',?1,'%')  ORDER BY name", nativeQuery = true)
    public List<Disease> searchDisease(String name);
}
