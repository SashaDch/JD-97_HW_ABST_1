package ru.netology.accounts;

public class SimpleAccount extends Account {
    public SimpleAccount(long amount) {
        super(amount);
    }

    public SimpleAccount() {
        this(0);
    }

    @Override
    public boolean add(long amount) {
        if (amount <= 0) {
            return false;
        }
        this.amount += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (this.amount < amount) {
            return false;
        }
        this.amount -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "SimpleAccount\namount: " + this.amount;
    }
}
