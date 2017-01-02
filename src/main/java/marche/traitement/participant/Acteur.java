package marche.traitement.participant;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Interface générale désignant les acteurs
 */

public abstract class Acteur {

    /**
     * Argent possédé par l'acteur
     */
    protected double solde;

    /**
     * Liste des produits fermiers possédé par le fermier
     */
    protected ArrayList<ProduitFermier> inventaire;

    /**
     * Nom de l'acteur
     */
    protected String nomActeur;

    /**
     * Prenom de l'acteur
     */
    protected String prenomActeur;
    /**
     * Empêchement d'instancier un acteur
     */
    protected Acteur() { }

    /**
     * Getter du solde de l'acteur courant
     * @return Solde de l'acteur
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Getter de l'inventaire de l'acteur
     * @return Inventaire de l'acteur
     */
    public ArrayList<ProduitFermier> getInventaire () {
        return inventaire;
    }

    /**
     * Fonction d'ajout du solde de l'acteur courant. Utile lors du crédit après une vente d'une offre
     * @param montant Montant à ajouter au solde de l'acteur
     */
    public void ajouterSolde(double montant) {
        solde += montant;
    }

    /**
     * Fonction pour enlever du solde de l'acteur courant. Utile lors du débit après une vente d'une offre
     * @param montant Montant à retirer au solde de l'acteur
     */

    public void enleverSolde(double montant) throws SoldeNonDisponibleException {
        if (solde >= montant)
            solde -= montant;
        else
            throw new SoldeNonDisponibleException();
    }


    /**
     * Méthode d'ajout de produit fermier dans l'inventaire
     * @param produit Produit à ajouter a l'inventaire de l'acteur
     */
    public void ajoutProduit(ProduitFermier produit) {
        inventaire.add(produit);
    }

    /**
     * Méthode permettant d'envelever un produit de l'inventaire
     * @param produit Produit à enlever de l'inventaire de l'acteur
     */
    public void enleverProduit(ProduitFermier produit){inventaire.remove(produit);}

    /**
     * Méthode permettant de récupérer le nom d'un acteur
     * @return nom de l'acteur
     */
    public String getNomActeur(){return this.nomActeur;}

    /**
     * Méthode permettant de récupérer le prénom d'un acteur
     * @return prénom de l'acteur
     */
    public String getPrenomActeur(){return this.prenomActeur;}
}
