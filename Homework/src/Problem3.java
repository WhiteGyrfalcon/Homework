import javafx.util.converter.IntegerStringConverter;

import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        String ahex = Integer.toHexString(a);
        String abin = Integer.toBinaryString(a);

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",ahex,abin,b,c);
    }
}
