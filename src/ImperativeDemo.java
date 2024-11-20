public class ImperativeDemo {
    public static void debit(Data data,int amount) {
        data.balance -= amount;
    }
    public static void credit(Data data, int amount) {
        data.balance += amount;
    }
    public static void main(String[] args) {
        Data aunggyi = new Data();
        debit(aunggyi, 500);
        credit(aunggyi, 1500);
        System.out.println(aunggyi.balance);
    }
}
