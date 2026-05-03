public class Circle extends Shape {

    Circle() {
        super();
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    static void showType() {
        System.out.println("Static method in Circle (method hiding)");
    }
}