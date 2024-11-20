public class AccountDemo {
    public static void main(String[] args) {
        Account myamyaAccount = new Account();
        Account hlahlaAccount = new Account();
        myamyaAccount.credit(500);
        myamyaAccount.debit(200);
        System.out.println("Mya Mya Account Balance: " + myamyaAccount.getBalance());
        hlahlaAccount.credit(300);
        hlahlaAccount.debit(100);
        System.out.println("Hla Hla Account Balance: " + hlahlaAccount.getBalance());
    }
}
