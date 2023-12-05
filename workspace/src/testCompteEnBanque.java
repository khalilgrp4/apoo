public class testCompteEnBanque {

    public static void main(String[] args) {
        Adresse  adresse = new Adresse("","","","");
        Date date1 = new Date(12, 1,2004);
        Date date2 = new Date(12,1,2022);

        Personne titulaire = new Personne("Lecompte","",date1,adresse);
        CompteEnBanque compteEnBanque = new CompteEnBanque(titulaire ,date1,"000-000000089-89",date2,1200 );

        System.out.println(compteEnBanque);
        compteEnBanque.deposermontant(100);

        System.out.println(compteEnBanque);
    }






}
