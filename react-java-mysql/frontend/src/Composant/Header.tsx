import '../index.css';
import React from 'react';
import Logo from '../image/veloxia.png';

const Header = () => {
    return (
        <header className={"flex"}>
            <img src={Logo} alt=""/>
            <button className={""}>Sarah le caca</button>
        </header>
    );
};

export default Header;

