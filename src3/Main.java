import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int balans = random.nextInt(1000);
        System.out.println("(Вы находитесь около двух банкоматов: VTB и BelVEB...)\nНажмите 1, чтобы востпользоваться VTB, нажмите 2, чтобы воспользоваться BelVEB");
        UserAtm userAtm = new UserAtm();
        userAtm.workUser(scanner, balans);
    }
}