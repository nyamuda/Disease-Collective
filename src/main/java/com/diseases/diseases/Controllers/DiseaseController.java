package com.diseases.diseases.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.diseases.diseases.Models.Disease;
import com.diseases.diseases.Services.DiseaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<Object> index() {
        Map<String, Boolean> success = new HashMap<>();
        success.put("success", true);
        return new ResponseEntity<Object>(success, HttpStatus.ACCEPTED);
    }

    @GetMapping("api/disease/{id}")
    @ResponseBody
    public ResponseEntity<Optional<Disease>> getDisease(@PathVariable("id") double id) {
        return ResponseEntity.ok().body(diseaseService.getDisease(id));
    }

    @GetMapping("api/diseases")
    @ResponseBody
    public ResponseEntity<List<Disease>> getAllDiseases() {
        return ResponseEntity.ok().body(diseaseService.getAllDiseases());
    }

    @GetMapping("api/diseases/{name}")
    @ResponseBody
    public ResponseEntity<List<Disease>> searchForDiseases(@PathVariable("name") String name) {
        return ResponseEntity.ok().body(diseaseService.searchDisease(name));
    }
}
