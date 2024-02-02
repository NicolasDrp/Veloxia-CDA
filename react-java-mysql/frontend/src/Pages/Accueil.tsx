import React, { useState, useEffect } from 'react';
import axios from 'axios';
import '../index.css';
import image1 from '../image/voiture.png';
import logo from '../image/veloxia.png';
interface Utilisateur {
  idUtilisateur: number;
  prenomUtilisateur: string;
  nomUtilisateur: string;
  emailUtilisateur: string;
}

const Accueil: React.FC = () => {

  return (

    <div className="relative h-screen">
            <div className="absolute inset-0">
                <img
                    className="object-cover w-full h-full"
                    src={image1}
                    alt="Nom de la voiture"
                />
            </div>
            <div className="absolute inset-0 flex items-center justify-center">
                <h3 className="text-white text-4xl text-center">Nom de la Voiture</h3>
            </div>
            <div className="absolute bottom-8 right-8">
                <button className="bg-white text-black px-4 py-2 rounded">Voir Voiture</button>
            </div>
        </div>
  );
};

export default Accueil;
