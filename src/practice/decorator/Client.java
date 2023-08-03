package practice.decorator;

public class Client {
    public static void main(String[] args)
    {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape greenRectangle = new GreenShapeDecorator(new Rectangle());
        Shape redGreenRectangle = new RedShapeDecorator(new GreenShapeDecorator(new Rectangle()));

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of green border");
        greenRectangle.draw();

        System.out.println("\nRectangle of green border of red border");
        redGreenRectangle.draw();
    }
}
