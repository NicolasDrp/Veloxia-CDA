import React from 'react';
import { useLocation } from 'react-router-dom';

const Footer: React.FC = () => {
  const location = useLocation();
  const isAccueilPage = location.pathname === '/';

  return (
    <footer className={`text-center py-4 fixed bottom-0 w-full z-50 ${isAccueilPage ? 'text-white' : 'text-black'}`}>
      <p className="text-xl">©️Veloxia 2024  Mentions légales </p>
    </footer>
  );
};

export default Footer;
