import java.util.Scanner;

public class InsertionMany {
    public void insertion(Scanner scanner, UserAtm userAtm) {
        System.out.println("Выберите сумму, которую хотите вывести(введите число)");
        int currency = scanner.nextInt();
        int fiftyDivision = currency % 50;
        int twentyDivision = currency % 20;
        int balance = userAtm.getInfoBalance();
        if ((currency < balance) && ((fiftyDivision == 0) || (twentyDivision == 0))) {
            userAtm.extraditionBonds(currency);
        } else {
            System.out.println("Неверный фомат данных");
        }
    }
}