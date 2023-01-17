package main;

public class Main {
    public static void main(String[] args) {
        Produit[] produits = new Produit[5];

        produits[0] = new Produit("Licence Copilot", false, 10, 12);
        produits[1] = new Produit("Ordinateur Quantique", false, 5000, 19);
        produits[2] = new Produit("Ordinateur EdN", true, 100, 7);
        produits[3] = new Produit("Souris EdN", true, 20, 3);
        produits[4] = new Produit("Disque Dur 2To", false, 100, 42);

        StockGuildeMarchande stock = new StockGuildeMarchande(produits);

        int nbJours = 45;
        for (int i = 0; i < nbJours; i++) {
            System.out.println("------------ Jour " + (i + 1) + " ------------");
            for (Produit produit : produits) {
                System.out.println(produit);
            }
            System.out.println();
            stock.update();
        }
    }
}