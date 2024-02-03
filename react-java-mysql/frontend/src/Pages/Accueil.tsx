import React, { useState, useEffect } from 'react';
import axios from 'axios';

interface Modele {
  idModele: number;
  nomModele: string;
  portes: number;
  prixModele: number;
}

const Accueil: React.FC = () => {
  const [infoModele, setinfoModele] = useState<Modele[]>([]);
  const [indexModele, setindexModele] = useState(0);

  useEffect(() => {
    axios.get<Modele[]>('http://localhost:3000/api/modeles')
      .then(response => {
        setinfoModele(response.data);
      })
      .catch(error => {
        console.error('Erreur lors de la récupération des données', error);
      });
  }, []);

  const handleSuivant = () => {
    setindexModele((IndexPrecedant) => (IndexPrecedant + 1) % infoModele.length);
  };

  const handlePrecedant = () => {
    setindexModele((IndexPrecedant) => (IndexPrecedant - 1 + infoModele.length) % infoModele.length);
  };

  const nomModele = infoModele[indexModele]?.nomModele;

  return (
    <div className="relative h-screen" style={{ userSelect: 'none' }}>
      <div className="w-full h-full relative">
        {nomModele && (
          <>
            <img
              className="object-cover w-full h-full"
              src={require(`../image/${nomModele}.jpg`)}
              alt={nomModele}
            />

            <div className="absolute inset-0 flex items-center justify-center text-black text-4xl text-center">
              <div className="absolute top-1/4 w-full text-center">
                <h3 className="font-bold drop-shadow-2xl text-5xl" style={{ userSelect: 'none' }}>{nomModele}</h3>
              </div>
            </div>
          </>
        )}
        <div className="absolute top-1/2 transform -translate-y-1/2 left-4 cursor-pointer" onClick={handlePrecedant}>
          <svg
            xmlns="http://www.w3.org/2000/svg"
            fill="none"
            viewBox="0 0 24 24"
            stroke="currentColor"
            className="w-8 h-8 text-white"
          >
            <path
              strokeLinecap="round"
              strokeLinejoin="round"
              strokeWidth="2"
              d="M15 19l-7-7 7-7"
            />
          </svg>
        </div>
        <div className="absolute top-1/2 transform -translate-y-1/2 right-4 cursor-pointer" onClick={handleSuivant}>
          <svg
            xmlns="http://www.w3.org/2000/svg"
            fill="none"
            viewBox="0 0 24 24"
            stroke="currentColor"
            className="w-8 h-8 text-white"
          >
            <path
              strokeLinecap="round"
              strokeLinejoin="round"
              strokeWidth="2"
              d="M9 5l7 7-7 7"
            />
          </svg>
        </div>
      </div>
      <div className="absolute bottom-40 right-24">
        <a href={`/Voiture/${infoModele[indexModele]?.idModele}`}>
          <button className="bg-[#FAFAFA] text-black px-24 py-6 rounded text-3xl font-semibold" style={{ userSelect: 'none' }}>
            Voir véhicule
          </button>
        </a>
      </div>
    </div>
  );
};

export default Accueil;

