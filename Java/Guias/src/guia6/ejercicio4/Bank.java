package guia6.ejercicio4;


import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount bk) {
        accounts.add(bk);
    }

    public void removeAccount(BankAccount bk) {
        accounts.remove(bk);
    }

    public int accountSize() {
        return accounts.size();
    }

    public double totalAmount() {
        double total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

}
