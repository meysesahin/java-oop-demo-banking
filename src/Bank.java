import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    private List<Account> accountList;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.accountList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public Account createAccount(AccountOwner accountOwner) {
        String accountNumber = getRandomNumberString();
        Account newAccount = new Account(accountOwner, accountNumber);
        this.accountList.add(newAccount);
        return newAccount;
    }

    public Account createPremiumAccount(AccountOwner accountOwner) {
        String accountNumber = getRandomNumberString();
        Account newAccount = new PremiumAccount(accountOwner, accountNumber);
        this.accountList.add(newAccount);
        return newAccount;
    }

    private String getRandomNumberString() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    @Override
    public String toString() {
        String s = "---------------------------------\n" +
                "Banka adı: " + name + "\n" +
                "---------------------------------\n";
        s += "Bankaya kayıtlı hesaplar: \n";
        for (Account account : accountList) {
            s += "\n" + account + "\n";
        }
        s += "---------------------------------";
        return s;
    }
}
