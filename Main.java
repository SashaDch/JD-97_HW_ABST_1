import ru.netology.accounts.Account;
import ru.netology.accounts.CreditAccount;
import ru.netology.accounts.SimpleAccount;

public class Main {
    public static void main(String[] args) {
        Account[] accs = new Account[] {
                new SimpleAccount(),
                new CreditAccount(100),
                new SimpleAccount(100)
        };
        printAccs(accs);

        System.out.println("accs[0]: " + accs[0]);
        System.out.println("accs[0].getBalance(): " + accs[0].getBalance());
        System.out.println("accs[0].pay(10): " + accs[0].pay(10));
        System.out.println("accs[0].getBalance(): " + accs[0].getBalance());
        System.out.println("accs[0].add(100): " + accs[0].add(100));
        System.out.println("accs[0].getBalance(): " + accs[0].getBalance());
        System.out.println("accs[0].pay(10): " + accs[0].pay(10));
        System.out.println("accs[0].getBalance(): " + accs[0].getBalance());

        System.out.println();

        System.out.println("accs[1]: " + accs[1]);
        System.out.println("accs[1].getBalance(): " + accs[1].getBalance());
        System.out.println("accs[1].pay(10): " + accs[1].pay(10));
        System.out.println("accs[1].getBalance(): " + accs[1].getBalance());
        System.out.println("accs[1].add(100): " + accs[1].add(100));
        System.out.println("accs[1].getBalance(): " + accs[1].getBalance());
        System.out.println("accs[1].pay(10): " + accs[1].pay(10));
        System.out.println("accs[1].getBalance(): " + accs[1].getBalance());

        System.out.println();
        System.out.println("accs[0].getBalance(): " + accs[0].getBalance());
        System.out.println("accs[1].getBalance(): " + accs[1].getBalance());
        System.out.println("accs[1].transfer(accs[0], 100): " + accs[1].transfer(accs[0], 100));
        System.out.println("accs[0].getBalance(): " + accs[0].getBalance());
        System.out.println("accs[1].getBalance(): " + accs[1].getBalance());
        System.out.println("accs[1].transfer(accs[0], 100): " + accs[1].transfer(accs[0], 100));
        System.out.println("accs[0].getBalance(): " + accs[0].getBalance());
        System.out.println("accs[1].getBalance(): " + accs[1].getBalance());
    }

    public static void printAccs(Account[] accs) {
        for (int i = 0; i < accs.length; i++) {
            System.out.println((i + 1) + ") " + accs[i] + "\n");
        }
    }
}