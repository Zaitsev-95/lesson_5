import java.util.Scanner;

public class ConclusionMoney {
    public void conclusion(Scanner scanner, UserAtm userAtm) {
        System.out.println("Внесите сумму в купюроприемник...(введите число)");
        int currency = scanner.nextInt();
        int fiftyDivision = currency % 50;
        int twentyDivision = currency % 20;
        if ((fiftyDivision == 0) || (twentyDivision == 0)) {
            int replenishment = userAtm.replenishment(currency);
            System.out.printf("Счёт пополнен на: %d%nCумма на счету: %d", currency, replenishment);
        } else {
            System.out.println("В нашей стране наменал купюр только 20,50,100!");
        }
    }
}