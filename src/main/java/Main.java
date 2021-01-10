public class Main {
    public static void main(String[] args) throws InterruptedException {
        Report account = new Report();
        Thread thread1 = new Thread(null, account::transfer, "Магазин Сказка");
        Thread thread2 = new Thread(null, account::transfer, "Магазин Басня");
        Thread thread3 = new Thread(null, account::transfer, "Магазин Роман");

        thread1.start();
        thread2.start();
        thread3.start();

        thread3.join();
        thread2.join();
        thread1.join();
        System.out.println("\nСумма всех дневных отчетов: " + account.getCurrent());
    }
}