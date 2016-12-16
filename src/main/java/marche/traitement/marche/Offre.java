package marche.traitement.marche;

import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Fermier;
import marche.traitement.participant.Vendeur;
import marche.traitement.produits.ProduitFermier;

import java.util.Collection;

/**
 * Classe Offre
 * @author Nicolas Guigou
 *
 */
public class Offre {

    /**
     *  Le prix de l'offre
     */
    private double prix;

    /**
     * Produits concernés par l'offre
     */

    private Collection<ProduitFermier> produits;

    /**
     * Attribut peremettant d'identifier une offre
     */
    private int IDOffre;

    /**
     * Constructeur de la classe
     */
    public Offre( double prix, Collection<ProduitFermier> produits ){
        this.prix = prix;
        this.produits = produits;
    }

    /**
     * Méthode permettant de récupérer l'id de l'offre
     * @return int IDOffre
     */
    public int getIDOffre(){
        return this.IDOffre;
    }
    /**
     * Méthode valider
     */
    public boolean valider(){


        return true;// TODO modifer le return en fonction du corps
    }

    /**
     * Méthode acheter
     */
    public void acheter(Acheteur acheteur){

        //TODO implémenter la méthdoe

    }

    /**
     * Peremet de retourner la collection de produit
     * @return Collection<ProduitFermier> ProduitFermier produits
     */
    public Collection<ProduitFermier> getProduits(){
        return this.produits;
    }

    public double getPrix(){
        return this.prix;
    }


}
