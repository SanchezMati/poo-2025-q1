package guia4.ejercicio9;

abstract class BankAccount {
    private final int id;
    private double balance;

    protected BankAccount(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    protected abstract boolean canExtract(double amount);

    public void extract(double amount) {
        if (!canExtract(amount)) {
            throw new RuntimeException("No se realiza por falta de fondos");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Cuenta %d con saldo %.2f".formatted(id, balance);
    }
}
