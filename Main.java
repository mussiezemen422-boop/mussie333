public class Main {
    public static void main(String[] args) {

        // Polymorphism
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s2.draw();

        System.out.println();

        // Multilevel inheritance demo
        new SquareChild();

        System.out.println();

        // Static method hiding
        Shape.showType();
        Circle.showType();
    }
}