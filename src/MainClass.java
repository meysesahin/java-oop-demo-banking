public class MainClass {
    public static void main(String[] args) {
        Bank bank = new Bank("Java Bank");

        AccountOwner accountOwner1 = new AccountOwner("Person A", "10001", "0101010101");
        AccountOwner accountOwner2 = new AccountOwner("Person B", "20002", "0202020202");

        Account account1 = bank.createPremiumAccount(accountOwner1);
        Account account2 = bank.createAccount(accountOwner2);

        System.out.println(accountOwner1.getName() + " hesap işlemleri:");
        account1.deposit(100);
        account1.transfer(account2, 10);
        account1.withdraw(75);
        account1.withdraw(150);
        account1.deposit(100);

        System.out.println(accountOwner2.getName() + " hesap işlemleri:");
        account2.deposit(500);
        account2.transfer(account1, 100);
        account2.withdraw(200);

        System.out.println(bank);
    }
}
