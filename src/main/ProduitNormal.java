package main;

public class ProduitNormal extends Produit{
    /**
     * Crée un nouveau produit avec le nom, s'il est collector, le prix et le nombre de jours avant péremption spécifiés.
     *
     * @param nom             le nom du produit
     * @param prix            le prix du produit
     * @param nbJoursRestants le nombre de jours avant péremption du produit
     */
    public ProduitNormal(String nom, int prix, int nbJoursRestants) {
        super(nom, false, prix, nbJoursRestants);
    }

    @Override
    public void update() {
        usureNormale();
        this.nbJoursRestants--;
        if (this.nbJoursRestants < 0){
            usureObsolescence();
        }

    }

    public void usureNormale(){
        decrementerPrix();
    }

    public void usureObsolescence(){
        decrementerPrix();
    }

    public void incrementerPrix(){
        if (this.prix < 500){
            this.prix++;
        }
    }

    public void decrementerPrix(){
        if (this.prix > 0){
            this.prix--;
        }
    }
}


