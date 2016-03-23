import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
            for (int i = 1; i <= 20; i++) {
                if(target-i>=0) {
                    System.out.printf("%d+%d = %d", i, (target - i), target);
                    System.out.println();
                }
                else {
                    System.out.printf("%d%d = %d", i, (target - i), target);
                    System.out.println();
                }
            }
    }

}
