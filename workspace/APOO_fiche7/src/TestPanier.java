public class TestPanier {
    public static void main(String[] args) {
        Panier panier = new Panier();
        Livre livre1 = new Livre("A","B",1.00,"Khalil",100);
        Livre livre2 = new Livre("C","D",9.99,"Baddou",100);
        Dvd dvd = new Dvd("Musique","musique",70.00,"Lihwak");
        panier.ajouter(livre1);
        panier.ajouter(livre2);
        panier.ajouter(dvd);
        System.out.println(panier.calculerPrix());
        System.out.println(panier);
        System.out.println(panier.nbrProduits());
    }
}
