import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        //Random rand = new Random();
        for (int i = 0; i <= Math.abs(n-m); i++) {
            System.out.print((ThreadLocalRandom.current().nextInt(Math.min(n,m), Math.max(n,m) + 1))+" ");
        }

    }
}
