class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 5);
        Rectangle rectangle2 = new Rectangle(6, 10);
        Rectangle rectangle3 = new Rectangle(2, 8);
        System.out.println(rectangle1.calculerAir());
        System.out.println(rectangle2.calculerPerimetre());
        System.out.println(rectangle3.toString());  // on peut juste mettre "rectangle3" sans forcément mettre le toString après


    }

}
