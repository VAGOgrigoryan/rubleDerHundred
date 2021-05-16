public class Main {
    public static void main(String[] args) {
        int startingBalance = 100;
        int replenishment = 2000;
        int limit = 1000;

        int finalAccount;
        if (replenishment > limit) {
            finalAccount = (replenishment/100)+(replenishment+startingBalance);
        } else {
            finalAccount = replenishment+startingBalance;
        }
        System.out.println("Итоговый счет: " + finalAccount);
    }
}
