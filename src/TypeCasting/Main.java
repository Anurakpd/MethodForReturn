package TypeCasting;

public class Main {
    public static void main(String[] args) {
        Shape shape= new Circle();
        shape.draw();
        Shape shape1= new Square();
        shape1.draw();

        Circle c1= (Circle) shape;
        c1.draw1();
        c1.draw();

        Square s1= (Square) shape1;
        s1.draw2();
        s1.draw();

    }
}
