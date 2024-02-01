import React, {  } from "react";
import "./App.css";
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Accueil from "./Pages/Accueil";
import Test from "./Pages/Test";


function App() {
  return (
    <>
      <BrowserRouter>
        {/* <Header /> */}
        <Routes>
          <Route element={<Accueil />} path={'/'} />
          <Route element={<Test />} path={'/test'} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
