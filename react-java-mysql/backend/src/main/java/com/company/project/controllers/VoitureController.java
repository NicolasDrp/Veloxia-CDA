package com.company.project.controllers;


import com.company.project.entity.Voiture;
import com.company.project.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class VoitureController {
    @Autowired
  private VoitureService voitureService;
    @GetMapping("/voiture")
    public Voiture recupererVoitureId(int id){
        return voitureService.recupererVoitureId(id);
    }
    @PostMapping("/voiture")
    public Voiture creerVoiture (Voiture voiture){
        return voitureService.creerVoiture(voiture);
    }
    @DeleteMapping("/voiture")
    public void supprimerVoiture(Voiture voiture){
         voitureService.supprimerVoiture(voiture);
    }
}
