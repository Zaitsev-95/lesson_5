import java.util.Scanner;

public class Triangle extends Figure {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    Scanner scanner = new Scanner(System.in);

    public double getSideOne() {
        return sideOne = scanner.nextDouble();
    }

    public double getSideTwo() {
        return sideTwo = scanner.nextDouble();
    }

    public double getSideThree() {
        return sideThree = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        double perimeter = (sideOne + sideThree + sideThree) / 2;
        return Math.sqrt(perimeter * (perimeter - sideOne) * (perimeter - sideTwo) * (perimeter - sideThree));
    }
}