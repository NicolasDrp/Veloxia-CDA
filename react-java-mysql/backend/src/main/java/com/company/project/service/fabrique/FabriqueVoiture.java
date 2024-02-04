package com.company.project.service.fabrique;

import com.company.project.entity.Voiture;

public class FabriqueVoiture extends FabriqueVehicule {

	private static FabriqueVoiture instance;

	public static synchronized FabriqueVoiture getInstance() {
		if (instance == null) {
			instance = new FabriqueVoiture();
		}
		return instance;
	}

	@Override
	public Vehicule creeVehicule() {
		return new Voiture();
	}
}
