import java.util.Scanner;

public class Square extends Figure {
    Scanner scanner = new Scanner(System.in);
    private double side;

    public double getSide() {
        return side = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}