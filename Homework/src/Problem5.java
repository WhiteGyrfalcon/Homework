import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int base = 7;
        String number = Integer.toString(n,base);
        System.out.println(number);
    }
}
