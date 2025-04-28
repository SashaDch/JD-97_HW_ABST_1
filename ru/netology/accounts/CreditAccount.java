package ru.netology.accounts;

public class CreditAccount extends Account {
    protected long overdraft;

    public CreditAccount(long overdraft, long amount) {
        super(amount);
        this.overdraft = overdraft;
    }

    public CreditAccount(long overdraft) {
        this(overdraft, 0);
    }

    public CreditAccount() {
        this(0, 0);
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
        if (this.amount + this.overdraft < amount) {
            return false;
        }
        this.amount -= amount;
        return true;
    }

    public long getOverdraft() {
        return this.overdraft;
    }

    public boolean setOverdraft(long overdraft) {
        if (overdraft < 0) {
            return false;
        }
        this.overdraft = overdraft;
        return true;
    }

    @Override
    public String toString() {
        return "CreditAccount\namount: " + this.amount
                + "\noverdraft: " + this.overdraft;
    }
}
