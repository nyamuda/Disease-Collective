package com.diseases.diseases.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "diseases")
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double id;

    private String name;

    private String link;

    private String symptoms;

    private String causes;

    private String riskFactor;

    private String overview;

    private String treatment;

    private String medication;

    private String homeRemedies;

    public Double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCauses() {
        return causes;
    }

    public String getHomeRemedies() {
        return homeRemedies;
    }

    public String getLink() {
        return link;
    }

    public String getMedication() {
        return medication;
    }

    public String getOverview() {
        return overview;
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setCauses(String causes) {
        this.causes = causes;
    }

    public void setHomeRemedies(String homeRemedies) {
        this.homeRemedies = homeRemedies;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

}
