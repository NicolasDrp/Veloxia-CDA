import '../index.css';
import React from 'react';
import Logo from '../image/veloxia.png';

const Header = () => {
    return (
        <header className={"flex justify-between items-center pl-10 pr-10 fixed w-full z-50"}>
            <img src={Logo} alt=""/>
            <button
                className="bg-gray-900 hover:bg-gray-950 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
                type="button" style={{ userSelect: 'none' }}>
                Connexion
            </button>
        </header>
    );
};

export default Header;

