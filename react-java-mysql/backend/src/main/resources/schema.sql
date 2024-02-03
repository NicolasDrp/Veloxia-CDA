-- Création de la table `concessionnaire`
CREATE TABLE IF NOT EXISTS concessionnaire (
    id_concessionnaire INT AUTO_INCREMENT PRIMARY KEY,
    nom_concessionnaire VARCHAR(50) NOT NULL,
    numero_rue INT NOT NULL,
    rue VARCHAR(50) NOT NULL,
    ville VARCHAR(50) NOT NULL,
    code_postal INT NOT NULL,
    pays VARCHAR(50) NOT NULL
);

-- Création de la table `utilisateur`
CREATE TABLE IF NOT EXISTS utilisateur (
    id_utilisateur INT AUTO_INCREMENT PRIMARY KEY,
    prenom_utilisateur VARCHAR(50) NOT NULL,
    nom_utilisateur VARCHAR(50) NOT NULL,
    mot_de_passe VARCHAR(100) NOT NULL,
    email_utilisateur VARCHAR(255) UNIQUE NOT NULL
);

-- Création de la table `modele`
CREATE TABLE IF NOT EXISTS modele (
    id_modele INT AUTO_INCREMENT PRIMARY KEY,
    description_modele TEXT NOT NULL,
    nom_modele VARCHAR(50) NOT NULL,
    portes INT NOT NULL,
    prix_modele INT NOT NULL
);

-- Création de la table `voiture`
CREATE TABLE IF NOT EXISTS voiture (
    id_voiture INT AUTO_INCREMENT PRIMARY KEY,
    couleur_voiture VARCHAR(20) NOT NULL,
    id_modele INT NOT NULL,
    FOREIGN KEY (id_modele) REFERENCES Modele(id_modele)
);

-- Création de la table `commande`
CREATE TABLE IF NOT EXISTS commande (
    id_commande INT AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(100) NOT NULL,
    date_livraison DATE NOT NULL,
    id_voiture INT NOT NULL ,
    id_utilisateur INT NOT NULL,
    id_concessionnaire INT NOT NULL,
    FOREIGN KEY (id_voiture) REFERENCES Voiture(id_voiture),
    FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur(id_utilisateur),
    FOREIGN KEY (id_concessionnaire) REFERENCES Concessionnaire(id_concessionnaire)
);

-- Création de la table `notification`
CREATE TABLE IF NOT EXISTS notification (
    id_notification INT AUTO_INCREMENT PRIMARY KEY,
    message TEXT NOT NULL,
    date_envoie DATE NOT NULL,
    id_commande INT NOT NULL ,
    FOREIGN KEY (id_commande) REFERENCES Commande(id_commande)
);
