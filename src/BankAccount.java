public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public Double deposit(double sum) {
        amount = getAmount() + sum;
        System.out.println("Внесено на счет: " + getAmount());
        return amount;
    }

    public Double withDraw(int sum) throws LimitException {
        if (amount < sum) {
                throw new LimitException("Недостаточно денег на счету", getAmount());
            } else {
                amount = getAmount() - sum;
                System.out.println("Со счета списано: " + sum);
            }
        return amount;
    }
}


