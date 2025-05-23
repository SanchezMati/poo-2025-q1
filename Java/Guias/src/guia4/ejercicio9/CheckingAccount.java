package guia4.ejercicio9;

public class CheckingAccount extends BankAccount {
    private final double overdraftAmount;

    public CheckingAccount(int id, double overdraftAmount) {
        super(id);
        this.overdraftAmount = overdraftAmount;
    }

    @Override
    protected boolean canExtract(double amount) {
        return overdraftAmount >= getBalance() - amount;
    }
}
