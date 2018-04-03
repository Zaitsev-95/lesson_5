import java.util.Scanner;

public class Rectangle extends Figure {
    private double width;
    private double sideRectangle;
    Scanner scanner = new Scanner(System.in);

    public double getSide() {
        return sideRectangle = scanner.nextDouble();
    }

    public double getWidth() {
        return width = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        return sideRectangle * width;
    }
}