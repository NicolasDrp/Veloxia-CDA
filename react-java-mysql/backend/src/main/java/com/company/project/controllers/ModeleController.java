package com.company.project.controllers;
import com.company.project.entity.Modele;
import com.company.project.service.ModeleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModeleController {
    @Autowired
    private ModeleService modeleService;
    @GetMapping("/modele")
    public Modele recupererModeleparId(int id){
        return modeleService.recupererModeleParId(id);
    }
    @GetMapping("/modeles")
    public List<Modele> recupererModeles(){
        return modeleService.recupererModeles();
    }
    @PostMapping("/modele")
    public Modele creerModele (Modele modele){
        return modeleService.creerModele(modele);
    }
    @DeleteMapping("/modele")
    public void supprimerModele (Modele modele){
        modeleService.supprimerModele(modele);
    }

}
