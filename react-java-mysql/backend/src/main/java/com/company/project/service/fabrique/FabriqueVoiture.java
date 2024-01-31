package com.company.project.service.fabrique;

import com.company.project.entity.Voiture;

public class FabriqueVoiture extends FabriqueVehicule {
    @Override
    public Vehicule creeVehicule() {
        return new Voiture();
    }
}
