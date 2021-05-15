public class Main {
    public static void main(String[] args) {
        int startingBalance = 100;
        int replenishment = 2000;
        int limit = 1000;

        if (replenishment >= limit) {
            int finalAccount = (replenishment/100)+(replenishment+startingBalance);
            System.out.println("Итоговый счет: " + finalAccount);
        } else {
            int finalAccount = replenishment+startingBalance;
            System.out.println("Итоговый счет: " + finalAccount);
        }
    }
}
