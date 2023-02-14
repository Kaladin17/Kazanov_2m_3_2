public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.00);
        while (true) {
            try {
                bankAccount.withDraw(6000);

            } catch (LimitException a) {
                try {
                    bankAccount.withDraw((int) a.getRemainingAmount());
                } catch (LimitException b) {
                    b.getRemainingAmount();
                }break;

            }
        }
    }
}