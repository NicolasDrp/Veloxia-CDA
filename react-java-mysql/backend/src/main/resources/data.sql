--Ajout d'un utilisateur
INSERT INTO utilisateur (prenom_utilisateur, nom_utilisateur, mot_de_passe, email_utilisateur)
VALUES ('prenom', 'nom', 'motdepasse123', 'mail@mail.com');

-- ajoute de modele de voiture
INSERT INTO modele (nom_modele, description_modele, portes, prix_modele) VALUES ('KLASIC','Elle est vieille mais elle roule (Je crois).', 4, 30000);

INSERT INTO modele (nom_modele, description_modele, portes, prix_modele) VALUES ('LOTRE',"Je sais plus, j'ai plus d'idées", 5, 40000);

INSERT INTO modele (nom_modele, description_modele, portes, prix_modele) VALUES ('ENKOR1OTRE','Encore une autre voiture, bref achète', 2, 25000);
