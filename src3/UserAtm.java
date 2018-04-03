import java.util.InputMismatchException;
import java.util.Scanner;

public class UserAtm implements InfoAccount {
    private String nameAndSecondname = "Dzmitry Vasin";
    private String accountNumber = "6052 1799 6389 2101";
    private int infoBalance;

    public String getNameAndSecondname() {
        return nameAndSecondname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getInfoBalance() {
        return infoBalance;
    }

    public void setInfoBalance(int infoBalance) {
        this.infoBalance = infoBalance;
    }

    public int replenishment(int number) {
        infoBalance = infoBalance + number;
        return infoBalance;
    }

    @Override
    public String getInfoAccount() {
        String name = this.nameAndSecondname = nameAndSecondname;
        String account = this.accountNumber = accountNumber;
        System.out.printf("%nДобро пожаловать %s%nЛицевой счёт №:%s", name, account);
        return name;
    }

    public void extraditionBonds(int currency) {
        int bondHundred = 0;
        int bondFifty = 0;
        int bondTwenty = 0;
        int x100 = 0;
        int x50 = 0;
        int x20 = 0;
        if (currency >= 100) {
            x100 += currency / 100;
            currency -= x100 * 100;
        }
        if (currency >= 50) {
            x50 += currency / 50;
            currency -= x50 * 50;
        }
        if (currency >= 20) {
            x20 += currency / 20;
        }
        bondHundred += x100;
        bondFifty += x50;
        bondTwenty += x20;
        System.out.printf("%d по 100,%d по 50,%d по 20 ", bondHundred, bondFifty, bondTwenty);
    }

    public void workUser(Scanner scanner, int balans) {
        try {
            int choice = scanner.nextInt();
            InfoAccount infoAccount = new UserAtm();
            UserAtm userAtm = new UserAtm();
            userAtm.setInfoBalance(balans);
            if (choice == 1) {
                BaseAtm atm = new AtmVTB();
                atm.choiceATM(balans, (UserAtm) infoAccount, atm);

            } else if (choice == 2) {
                BaseAtm atm = new AtmBelveb();
                atm.choiceATM(balans, (UserAtm) infoAccount, atm);
            } else {
                System.out.println("Неверный фомат данных");
            }
            System.out.println("Вводд средств(нажмите 1)\nСнятие средств(наджмите 2)");
            choice = scanner.nextInt();
            if (choice == 1) {
                ConclusionMoney conclusionMoney = new ConclusionMoney();
                conclusionMoney.conclusion(scanner, userAtm);
            } else if (choice == 2) {
                InsertionMany insertionMany = new InsertionMany();
                insertionMany.insertion(scanner, userAtm);
            } else {
                System.out.println("Неверный фомат данных");
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели текст!");
        }
    }
}