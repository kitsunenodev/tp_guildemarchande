package main;

public class StockGuildeMarchandeLegacy {
    Produit[] produits;

    public StockGuildeMarchandeLegacy(Produit[] produits) {
        this.produits = produits;
    }

    public void update() {
        for (int i = 0; i < produits.length; i++) {
            if (!produits[i].estCollector() && !produits[i].getNom().equals("Licence Copilot")) {
                if (produits[i].prix > 0) {
                    if (!produits[i].getNom().equals("Ordinateur Quantique")) {
                        produits[i].prix -= 1;
                    }
                }
            } else {
                if (produits[i].prix < 500) {
                    produits[i].prix = produits[i].prix + 1;

                    if (produits[i].getNom().equals("Licence Copilot")) {
                        if (produits[i].nbJoursRestants < 11) {
                            if (produits[i].prix < 500) {
                                produits[i].prix = produits[i].prix + 1;
                            }
                        }

                        if (produits[i].nbJoursRestants < 6) {
                            if (produits[i].prix < 500) {
                                produits[i].prix = produits[i].prix + 1;
                            }
                        }
                    }
                }
            }

            if (!produits[i].getNom().equals("Ordinateur Quantique")) {
                produits[i].nbJoursRestants = produits[i].nbJoursRestants - 1;
            }

            if (produits[i].nbJoursRestants < 0) {
                if (!produits[i].estCollector()) {
                    if (!produits[i].getNom().equals("Licence Copilot")) {
                        if (produits[i].prix > 0) {
                            if (!produits[i].getNom().equals("Ordinateur Quantique")) {
                                produits[i].prix = produits[i].prix - 1;
                            }
                        }
                    } else {
                        produits[i].prix = produits[i].prix - produits[i].prix;
                    }
                } else {
                    if (produits[i].prix < 50) {
                        produits[i].prix = produits[i].prix + 1;
                    }
                }
            }
        }
    }
}
