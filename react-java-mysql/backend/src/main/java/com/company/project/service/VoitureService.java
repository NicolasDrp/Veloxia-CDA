package com.company.project.service;


import com.company.project.entity.Voiture;
import com.company.project.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VoitureService {

    private  final VoitureRepository voitureRepository;

    @Autowired
    public VoitureService(VoitureRepository voitureRepository){
        this.voitureRepository = voitureRepository;

    }
    public Voiture creerVoiture(Voiture voiture) {
        voitureRepository.save(voiture);

        return voiture;
    }
    public Voiture recupererVoitureId(int id){
        return voitureRepository.findById(id).orElse(null);
    }
    public void supprimerVoiture(Voiture voiture){
        voitureRepository.delete(voiture);
    }

}
