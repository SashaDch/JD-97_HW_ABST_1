package ru.netology.accounts;

public abstract class Account {
    protected long amount;

    public Account() {
        this(0);
    }

    public Account(long amount) {
        this.amount = amount;
    }

    public long getBalance() {
        return this.amount;
    }

    public boolean transfer(Account account, long amount) {
        if (!this.pay(amount)) {
            return false;
        }
        if (!account.add(amount)) {
            this.add(amount);
            return false;
        }
        return true;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);
}
