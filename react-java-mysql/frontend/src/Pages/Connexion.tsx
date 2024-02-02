import React from 'react';

const Connexion = () => {
    return (
        <div className="w-full max-w-xl m-auto">
            <form className="bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4">
                <h2 className="" >Se connecter</h2>
                <div className="mb-10">
                    <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="email">
                        Email
                    </label>
                    <input className="appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="email" type="text" placeholder="Email" />
                </div>
                <div className="mb-10">
                    <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="mdp">
                        Mot de passe
                    </label>
                    <input className="appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="mdp" type="text" placeholder="Mot de passe" />
                </div>
                <div className="flex items-center justify-between flex-col">
                    <button className="bg-gray-900 hover:bg-gray-950 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline mb-8" type="button">
                        Connexion
                    </button>
                    <a className="inline-block align-baseline font-bold text-sm text-blue-500 hover:text-blue-800" href="#">
                        Mot de passe oublié ?
                    </a>
                </div>
            </form>
        </div>
    );
};

export default Connexion;
