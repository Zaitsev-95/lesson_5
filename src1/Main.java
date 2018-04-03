import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
       try {
           Circle circle = new Circle();
           System.out.println("Введите радиус окружности: ");
           circle.getRadius();
           double circleArea = circle.getArea();
           System.out.println("Площадь круга: " + circleArea + "\n");

           Square square = new Square();
           System.out.println("Введите значение стороны квадрата: ");
           square.getSide();
           double areaSquer = square.getArea();
           System.out.println("Площадь квадрата: " + areaSquer + "\n");

           Rectangle rectangle = new Rectangle();
           System.out.println("Введите значение стороны прямоугольника: ");
           rectangle.getSide();
           System.out.println("Введите значение высоты прямоугольника: ");
           rectangle.getWidth();
           double areaRectangle = rectangle.getArea();
           System.out.println("Площадь прямоугольника: " + areaRectangle + "\n");

           Triangle triangle = new Triangle();
           System.out.println("Введите значение первой стороны треугольника: ");
           triangle.getSideOne();
           System.out.println("Введите значение вторую стороны треугольника: ");
           triangle.getSideTwo();
           System.out.println("Введите значение третьей стороны треугольника: ");
           triangle.getSideThree();
           triangle.getArea();
           double areaTriangle = triangle.getArea();
           System.out.println("Площадь треугольника: " + areaTriangle);
       }catch (InputMismatchException e){
           System.err.println("Вы ввели текст!");
       }
    }
}