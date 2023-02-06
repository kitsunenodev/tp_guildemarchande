package main;

public class StockGuildeMarchande {
    Produit[] produits;

    public StockGuildeMarchande(Produit[] produits) {
        this.produits = produits;
    }

    public void update() {
        for (Produit produit : produits) {
            updateProduit(produit);
        }
    }

    private static void updateProduit(Produit produit) {
        if(produit.getNom().equals("Ordinateur Quantique")){
            return;
        }
        if (!produit.estCollector() && !produit.getNom().equals("Licence Copilot")) {
            decrementerPrix(produit);
        }
        else {
            incrementerPrix(produit);
            if (produit.getNom().equals("Licence Copilot")) {
                if (produit.nbJoursRestants < 11) {
                    incrementerPrix(produit);
                }
                if (produit.nbJoursRestants < 6) {
                    incrementerPrix(produit);
                }
            }
        }
        produit.nbJoursRestants = produit.nbJoursRestants - 1;
        if (produit.nbJoursRestants < 0) {
            if (!produit.estCollector()) {
                if (!produit.getNom().equals("Licence Copilot")) {
                    decrementerPrix(produit);
                } else {
                    produit.prix = 0;
                }
            } else {
                incrementerPrix(produit);
            }
        }
    }

    public static void incrementerPrix(Produit produit){
        if (produit.prix < 500){
            produit.prix++;
        }
    }
    public static void decrementerPrix(Produit produit){
        if(produit.prix >0) {
            produit.prix--;
        }

    }
}
