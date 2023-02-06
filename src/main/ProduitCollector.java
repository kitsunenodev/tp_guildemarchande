package main;

public class ProduitCollector extends ProduitNormal{


    /**
     * Crée un nouveau produit avec le nom, s'il est collector, le prix et le nombre de jours avant péremption spécifiés.
     *
     * @param nom             le nom du produit
     * @param prix            le prix du produit
     * @param nbJoursRestants le nombre de jours avant péremption du produit
     */
    public ProduitCollector(String nom, int prix, int nbJoursRestants) {
        super(nom, prix, nbJoursRestants);
    }

    @Override
    public boolean estCollector() {
        return true;
    }

    @Override
    public void usureNormale() {
        incrementerPrix();
    }

    @Override
    public void usureObsolescence() {
        incrementerPrix();
    }
}
