public class TestCercleDansLePlan {

    public static void main(String[] args) {
        Point point = new Point(4,2.5);
        CercleDansLePlan cercle1 = new CercleDansLePlan(4,point);
        CercleDansLePlan cercle2 = new CercleDansLePlan(12.5,point);
        cercle2.getCentre().setX(8);

        System.out.println(cercle1);
        System.out.println(cercle2);
    }


}
