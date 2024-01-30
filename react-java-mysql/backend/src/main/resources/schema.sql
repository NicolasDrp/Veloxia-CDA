-- Création de la table `Concessionnaire`
CREATE TABLE IF NOT EXISTS Concessionnaire (
    id_concessionnaire INT AUTO_INCREMENT PRIMARY KEY,
    nom_concessionnaire VARCHAR(50) NOT NULL,
    numero_rue INT NOT NULL,
    rue VARCHAR(50) NOT NULL,
    ville VARCHAR(50) NOT NULL,
    code_postal INT NOT NULL,
    pays VARCHAR(50) NOT NULL
);

-- Création de la table `Utilisateur`
CREATE TABLE IF NOT EXISTS Utilisateur (
    id_utilisateur INT AUTO_INCREMENT PRIMARY KEY,
    prenom_utilisateur VARCHAR(50) NOT NULL,
    nom_utilisateur VARCHAR(50) NOT NULL,
    mot_de_passe VARCHAR(100) NOT NULL,
    email_utilisateur VARCHAR(255) UNIQUE NOT NULL
);

-- Création de la table `Modele`
CREATE TABLE IF NOT EXISTS Modele (
    id_modele INT AUTO_INCREMENT PRIMARY KEY,
    nom_modele VARCHAR(50) NOT NULL,
    portes INT NOT NULL,
    prix_modele INT NOT NULL,
);

-- Création de la table `Voiture`
CREATE TABLE IF NOT EXISTS Voiture (
    id_voiture INT AUTO_INCREMENT PRIMARY KEY,
    couleur_voiture VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_modele) REFERENCES Modele(id_modele)
);

-- Création de la table `Commande`
CREATE TABLE IF NOT EXISTS Commande (
    id_commande INT AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(100) NOT NULL,
    date_livraison DATE NOT NULL,
    FOREIGN KEY (id_voiture) REFERENCES Voiture(id_voiture),
    FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur(id_utilisateur),
    FOREIGN KEY (id_concessionnaire) REFERENCES Concessionnaire(id_concessionnaire)
);

-- Création de la table `Notification`
CREATE TABLE IF NOT EXISTS Notification (
    id_notification INT AUTO_INCREMENT PRIMARY KEY,
    message TEXT NOT NULL,
    date_envoie DATE NOT NULL,
    FOREIGN KEY (id_commande) REFERENCES Commande(id_commande)
);