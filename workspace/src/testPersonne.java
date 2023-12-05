public class testPersonne {

    public static void main(String[] args) {
        Adresse adresse = new Adresse("Rue de la gare","34", "5000", "Namur" );
        Date datedenaissance1 = new Date(6, 2, 1968);
        Date datedenaissance2 = new Date(7, 3, 1970);
        Personne personne1 = new Personne("Shmidt", "Paul", datedenaissance1 , adresse);
        Personne personne2 = new Personne("Gobert", "Valérie",datedenaissance2 , adresse);


        System.out.println(personne1);
        System.out.println(personne2);



    }
}
