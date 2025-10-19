package ua.opnu.inheritance.account;

import ua.opnu.java.inheritance.account.Account;
import ua.opnu.java.inheritance.account.Startup;
import ua.opnu.java.inheritance.account.Credit;
import ua.opnu.java.inheritance.account.Debit;

public class MinMaxAccount extends Account {
    private int min;
    private int max;

    public MinMaxAccount(Startup startup) {
        super(startup.getBalance());
        this.min = getBalance();
        this.max = getBalance();
    }

    @Override
    public void debit(Debit d) {
        super.debit(d);
        updateMinMax();
    }

    @Override
    public void credit(Credit c) {
        super.credit(c);
        updateMinMax();
    }

    private void updateMinMax() {
        int balance = getBalance();
        if (balance < min) min = balance;
        if (balance > max) max = balance;
    }

    public int getMin() { return min; }
    public int getMax() { return max; }
}
