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
        if (!produit.estCollector() && !produit.getNom().equals("Licence Copilot")) {
            if (produit.prix > 0) {
                if (!produit.getNom().equals("Ordinateur Quantique")) {
                    produit.prix -= 1;
                }
            }
        } else {
            if (produit.prix < 500) {
                produit.prix = produit.prix + 1;

                if (produit.getNom().equals("Licence Copilot")) {
                    if (produit.nbJoursRestants < 11) {
                        if (produit.prix < 500) {
                            produit.prix = produit.prix + 1;
                        }
                    }

                    if (produit.nbJoursRestants < 6) {
                        if (produit.prix < 500) {
                            produit.prix = produit.prix + 1;
                        }
                    }
                }
            }
        }

        if (!produit.getNom().equals("Ordinateur Quantique")) {
            produit.nbJoursRestants = produit.nbJoursRestants - 1;
        }

        if (produit.nbJoursRestants < 0) {
            if (!produit.estCollector()) {
                if (!produit.getNom().equals("Licence Copilot")) {
                    if (produit.prix > 0) {
                        if (!produit.getNom().equals("Ordinateur Quantique")) {
                            produit.prix = produit.prix - 1;
                        }
                    }
                } else {
                    produit.prix = 0;
                }
            } else {
                if (produit.prix < 50) {
                    produit.prix = produit.prix + 1;
                }
            }
        }
    }
}
