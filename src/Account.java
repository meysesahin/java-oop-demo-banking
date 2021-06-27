import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private String lastTransaction;
    private AccountOwner accountOwner;
    private String accountNumber;
    private List<String> transactionList;


    public Account(AccountOwner accountOwner, String accountNumber) {
        this.balance = 0;
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.transactionList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(String lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(AccountOwner accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<String> getTransactionList() {
        return transactionList;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Hesabınıza " + amount + " TL para yüklenmiştir.");
        printBalance();
        System.out.println();
        transactionList.add("Para yükleme - " + amount + " TL");
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Yeterli bakiyeniz bulunmamaktadır.");
            System.out.println();
        } else {
            balance -= amount;
            System.out.println("Hesabınızdan " + amount + " TL para çekilmiştir.");
            printBalance();
            System.out.println();
            transactionList.add("Para çekme - " + amount + " TL");
        }
    }

    public void transfer(Account accountToTransfer, double amount) {
        if (balance < amount) {
            System.out.println("Yeterli bakiyeniz bulunmamaktadır.");
            System.out.println();
        } else {
            balance -= amount;
            accountToTransfer.balance += amount;
            System.out.println("Hesabınızdan " + accountToTransfer.getAccountOwner().getName() + " isimli kullanıcının " + accountToTransfer.getAccountNumber() + " No'lu hesabına " + amount + " TL para aktarılmıştır.");
            printBalance();
            System.out.println();
            transactionList.add("Para transferi - " + amount + " TL");
        }
    }

    public void printBalance() {
        System.out.println("Mevcut bakiyeniz: " + String.format("%.2f", balance) + " TL");
    }

    @Override
    public String toString() {
        return "Hesap No: " + accountNumber + "\n" +
                accountOwner +
                "Bakiye: " + balance + "\n" +
                "Son İşlemler: " + transactionList;
    }
}
