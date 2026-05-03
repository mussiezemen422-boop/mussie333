public class Shape {

    protected String type = "Shape";

    Shape() {
        System.out.println("Shape constructor (implicit super())");
    }

    void draw() {
        System.out.println("Drawing a shape");
    }

    final void info() {
        System.out.println("Final method - cannot be overridden");
    }

    static void showType() {
        System.out.println("Static method in Shape");
    }
}