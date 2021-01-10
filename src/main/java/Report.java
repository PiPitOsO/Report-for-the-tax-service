import java.util.concurrent.atomic.AtomicLong;
import java.util.Random;

public class Report {
    AtomicLong money = new AtomicLong(0);
    int lengthArr = 4;

    public int[] randomMas() {
        Random random = new Random();
        int[] arr = new int[lengthArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    public void transfer() {
        System.out.println(Thread.currentThread().getName() + " отправил отчет.");
        int[] mas = randomMas();
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        money.addAndGet(sum);
    }

    public long getCurrent() {
        return money.get();
    }
}