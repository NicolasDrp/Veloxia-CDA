package com.company.project.service;
import com.company.project.entity.Modele;
import com.company.project.repository.ModeleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeleService {
    private  final  ModeleRepository modeleRepository;
    @Autowired
    public ModeleService(ModeleRepository modeleRepository){
        this.modeleRepository = modeleRepository;
    }
    public Modele CreerModele(Modele modele){
        modeleRepository.save(modele);
        return modele;
    }
    public List<Modele> recupererModeles(){
        return modeleRepository.findAll();
    }
    public void supprimerModele(Modele modele){
        modeleRepository.delete(modele);
    }
}
