import java.util.Scanner;

public class Circle extends Figure {
    Scanner scanner = new Scanner(System.in);
    private double radius;

    public double getRadius() {
        return radius = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}