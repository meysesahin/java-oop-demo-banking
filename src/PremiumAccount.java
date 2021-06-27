public class PremiumAccount extends Account {
    public PremiumAccount(AccountOwner accountOwner, String accountNumber) {
        super(accountOwner, accountNumber);
    }

    @Override
    public void transfer(Account accountToTransfer, double amount) {
        super.transfer(accountToTransfer, amount);
        double bonus = amount / 100;
        setBalance(getBalance() + bonus);
        System.out.println("Hesabınıza " + bonus + " TL bonus yüklenmiştir.");
        printBalance();
        System.out.println();
    }
}
