package main;

import java.util.Objects;

/**
 * Représente un produit avec un nom, un prix et un nombre de jours avant l'obsolescence.
 *
 * @author Lucien Mousin, le grand maître de la guilde marchande de l'EdN
 */
public class Produit {
    private final String nom;
    private final boolean collector;
    public int prix;
    public int nbJoursRestants;

    /**
     * Crée un nouveau produit avec le nom, s'il est collector, le prix et le nombre de jours avant péremption spécifiés.
     *
     * @param nom le nom du produit
     * @param collector si le produit est un collector
     * @param prix le prix du produit
     * @param nbJoursRestants le nombre de jours avant péremption du produit
     */
    public Produit(String nom, boolean collector, int prix, int nbJoursRestants) {
        this.nom = nom;
        this.collector = collector;
        this.prix = prix;
        this.nbJoursRestants = nbJoursRestants;
    }

    /**
     * Retourne le nom du produit.
     *
     * @return le nom du produit
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne si le produit est un collector.
     *
     * @return si le produit est un collector
     */
    public boolean estCollector() {
        return collector;
    }

    /**
     * Met à jour l'état du produit.
     * Cette méthode peut être utilisée pour réduire le nombre de jours restants avant l'obsolescence du produit ou pour
     * mettre à jour le prix du produit.
     */
    public void update() {}

    /**
     * Retourne une représentation sous forme de chaîne de caractères du produit.
     *
     * @return une chaîne de caractères représentant le produit
     */
    @Override
    public String toString() {
        return nom + ((collector)?"*":"") + ", " + prix + "€, obselète dans " + nbJoursRestants + "j";
    }

    /**
     * Retourne une copie du produit.
     *
     * @return une copie du produit
     */
    @Override
    public Produit clone() {
        try {
            return (Produit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /**
     * Retourne si le produit spécifié est égal au produit.
     *
     * @param obj le produit à comparer
     * @return si le produit spécifié est égal au produit
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (this.collector != other.collector) {
            return false;
        }
        if (this.prix != other.prix) {
            return false;
        }
        return this.nbJoursRestants == other.nbJoursRestants;
    }


}