import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        try {
            StudentsRegistry studentsRegistry = new StudentsRegistry();
            Student[] students = studentsRegistry.produceStudent();
            studentsRegistry.middleAge(students);
            studentsRegistry.produceStudent();
        } catch (InputMismatchException e) {
            System.err.println("Не корректный ввод!");
        }
    }
}