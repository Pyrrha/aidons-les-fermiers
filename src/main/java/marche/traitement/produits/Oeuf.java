package marche.traitement.produits;

import marche.traitement.production.Poulailler;

import java.time.LocalDate;

/**
 * Classe Oeuf représentant un pack d'oeuf
 * @version 1.6
 */
public class Oeuf extends ProduitFermier {

    /**
     * Identifiant d'un pack d'oeuf.
     * Cette valeur est définie à la création du pack d'oeuf en fonction de la valeur d'idPackOeufGeneral, permettant d'obtenir
     * un identifiant unique.
     */
    private int idPackOeuf;


    /**
     * Attribut général d'un pack d'oeuf.
     * Cette valeur est incrémentée au fur et à mesure du code, permettant d'identifier les pack d'oeuf de manière unique.
     */
    private static int idPackOeufGeneral = 100;

    /**
     * Constructeur d'un Oeuf
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param poulailler     désigne le poulailler associé avec le pack d'oeuf
     */
    public Oeuf(float prix, LocalDate datePeremption, short qualite, Poulailler poulailler) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idPackOeuf = idPackOeufGeneral;
        idPackOeufGeneral += 100;
        this.uniteDeProduction = poulailler;
    }

    /** Retourne l'identifiant d'un pack d'oeuf
     *
     * @return l'identifiant d'un pack d'oeuf
     */
    public int getIdPackOeuf() {
        return idPackOeuf;
    }
}