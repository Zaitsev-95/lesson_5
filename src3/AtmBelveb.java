public class AtmBelveb extends BaseAtm {
    private String nameAtm = "BelVEB-Bank";

    @Override
    public void choiceATM(int balans, UserAtm infoAccount, BaseAtm atm) {
        String nameAtm = atm.infoAtm();
        System.out.println(nameAtm);
        String account = infoAccount.getInfoAccount();
        System.out.printf("%n%nБаланс на счёте: %s%n", balans);
    }

    @Override
    public String infoAtm() {
        return nameAtm;
    }
}