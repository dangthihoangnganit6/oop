import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 1 + rand.nextInt(6);
        int b = 1 + rand.nextInt(6);
        int sum = a + b;
        System.out.println(sum);
    }
}
