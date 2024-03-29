import React, {  } from "react";
import "./App.css";
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Accueil from "./Pages/Accueil";
import Voiture from "./Pages/Voiture";
import Header from "./Composant/Header";
import Footer from "./Composant/Footer";
import Connexion from "./Pages/Connexion";


function App() {
  return (
    <>
      <BrowserRouter>
         <Header/>
        <Routes>
          <Route element={<Accueil />} path={'/'} />
          <Route element={<Voiture />} path={'/voiture/:idVoiture'} />
          <Route element={<Connexion />} path={'/connexion'} />
        </Routes>
        <Footer/>
      </BrowserRouter>
    </>
  );
}

export default App;
