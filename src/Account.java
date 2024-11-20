public class Account {
    private int balance;

    public int getBalance() {
        return this.balance;
    }

    public void debit (int amount) {
        this.balance -= amount;
    }
    public void credit(int amount) {
        this.balance += amount;
    }
}
