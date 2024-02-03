import React from 'react';

const Connexion = () => {
    return (
        <div className="flex items-center justify-center mt-40">
            <form className="bg-white rounded px-24 pt-6 pb-8 mb-4 w-1/3 h-1/2">
                <h2 className="text-center font-bold text-2xl mb-10">Se connecter</h2>
                <div className="mb-6">
                    <label className="block text-gray-700 text-lg font-bold mb-2" htmlFor="email">
                        Email
                    </label>
                    <input className="appearance-none border rounded w-full py-3 px-4 text-lg text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="email" type="text" placeholder="Email" />
                </div>
                <div className="mb-6">
                    <label className="block text-gray-700 text-lg font-bold mb-2" htmlFor="mdp">
                        Mot de passe
                    </label>
                    <input className="appearance-none border rounded w-full py-3 px-4 text-lg text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="mdp" type="password" placeholder="Mot de passe" />
                </div>
                <div className="flex flex-col items-center">
                    <button className="bg-gray-900 hover:bg-gray-950 text-white font-bold py-3 px-36 rounded focus:outline-none focus:shadow-outline mb-8" type="button">
                        Connexion
                    </button>
                    <a className="inline-block align-baseline font-bold text-lg text-blue-500 hover:text-blue-800" href="#">
                        Mot de passe oublié ?
                    </a>
                </div>
            </form>
        </div>
    );
};

export default Connexion;
