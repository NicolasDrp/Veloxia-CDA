import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';

interface Modele {
  idModele: number;
  nomModele: string;
  descriptionModele: string;
  portes: number;
  prixModele: number;
}

const Voiture: React.FC = () => {
  const { idVoiture } = useParams<{ idVoiture: string }>();
  const [modeleInfo, setModeleInfo] = useState<Modele | null>(null);
  const [selectedColor, setSelectedColor] = useState<string | null>(null);

  useEffect(() => {
    axios.get<Modele>(`http://localhost:3000/api/modele?id=${idVoiture}`)
      .then(response => {
        setModeleInfo(response.data);
      })
      .catch(error => {
        console.error('Erreur lors de la récupération des données du modèle', error);
      });
  }, [idVoiture]);

  const handleColorClick = (color: string) => {
    setSelectedColor(color);
  };

  const handleConfirmCommande = () => {
    console.log("Commande confirmée !");
  };

  const colors = ["white", "black", "red", "yellow", "blue"];

  return (
    <div className="flex flex-col items-center p-8 mt-20">
      {modeleInfo && (
        <>
          <h1 className="text-3xl font-bold mb-6">{modeleInfo.nomModele}</h1>
          <div className="flex flex-col md:flex-row items-center md:items-start">
            <img src={require(`../image/${modeleInfo.nomModele}.jpg`)} alt={modeleInfo.nomModele} className="w-full md:w-1/2 mb-6 md:mr-6" />
            <div className="flex flex-col items-center md:items-start">
              <p className="text-lg mb-4">{`${modeleInfo.descriptionModele}`}</p>
              <p className="text-lg mb-4">{`Portes: ${modeleInfo.portes}`}</p>
              <p className="text-xl font-bold mb-4">{`Prix: ${modeleInfo.prixModele} €`}</p>
              <div className="flex mb-4">
                {colors.map((color, index) => (
                  <div
                    key={index}
                    className={`w-14 h-14 rounded-full cursor-pointer mr-2 shadow-lg ${color === selectedColor ? 'border-2 border-gray-500' : ''}`}
                    style={{ backgroundColor: color }}
                    onClick={() => handleColorClick(color)}
                  />
                ))}
              </div>
              <button
                className="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-700"
                onClick={handleConfirmCommande}
              >
                Confirmer la commande
              </button>
            </div>
          </div>
        </>
      )}
    </div>
  );
};

export default Voiture;
