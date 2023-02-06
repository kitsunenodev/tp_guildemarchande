package main;

public class ProduitEphemere extends ProduitNormal{
    /**
     * Crée un nouveau produit avec le nom, s'il est collector, le prix et le nombre de jours avant péremption spécifiés.
     *
     * @param nom             le nom du produit
     * @param prix            le prix du produit
     * @param nbJoursRestants le nombre de jours avant péremption du produit
     */
    public ProduitEphemere(String nom, int prix, int nbJoursRestants) {
        super(nom, prix, nbJoursRestants);
    }

    @Override
    public void usureNormale() {
        incrementerPrix();
        if (this.nbJoursRestants < 11) {
            this.incrementerPrix();
        }
        if (this.nbJoursRestants < 6) {
            this.incrementerPrix();
        }
    }

    @Override
    public void usureObsolescence() {
        this.prix = 0;
    }
}
