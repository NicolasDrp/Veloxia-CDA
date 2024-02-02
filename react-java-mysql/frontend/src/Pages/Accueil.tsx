import React, { useState, useEffect } from 'react';
import axios from 'axios';
import '../index.css';
interface Utilisateur {
  idUtilisateur: number;
  prenomUtilisateur: string;
  nomUtilisateur: string;
  emailUtilisateur: string;
  // Ajoutez d'autres champs si nécessaire
}

const Accueil: React.FC = () => {
  // État pour stocker les données de l'utilisateur
  const [utilisateur, setUtilisateur] = useState<Utilisateur | null>(null);

  // Utilisation de useEffect pour effectuer la requête lors du montage du composant
  useEffect(() => {
    const fetchUtilisateur = async () => {
      try {
        // Faites la requête pour récupérer l'utilisateur avec l'id 1
        const response = await axios.get<Utilisateur>("http://localhost:3000/api/utilisateur?id=1");

        // Mettez à jour l'état avec les données de l'utilisateur
        setUtilisateur(response.data);
      } catch (error) {
        console.error("Erreur lors de la récupération de l'utilisateur :", error);
      }
    };

    // Appelez la fonction pour effectuer la requête
    fetchUtilisateur();
  }, []); // Les crochets vides indiquent que cette fonction s'exécute uniquement une fois lors du montage du composant

  // Affichez les données de l'utilisateur
  return (
    <div>
      <h1>Accueil</h1>
      {utilisateur ? (
        <div>
          <p>ID Utilisateur: {utilisateur.idUtilisateur}</p>
          <p>Prénom: {utilisateur.prenomUtilisateur}</p>
          <p>Nom: {utilisateur.nomUtilisateur}</p>
          <p>Email: {utilisateur.emailUtilisateur}</p>
          {/* Ajoutez d'autres champs si nécessaire */}
        <p className="line-through ...">xcxcxcxcbcfgnfbfdvdsvdvsscdfsq</p>
        </div>
      ) : (
        <p>Chargement en cours...</p>
      )}
    </div>
  );
};

export default Accueil;
