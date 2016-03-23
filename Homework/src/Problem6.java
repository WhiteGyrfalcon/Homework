import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        int n = 0;
        int i = 0;
        while(number!=0) {
            n = number %10;
            sum+=n*Math.pow(7,i);
            number/=10;
            i++;
        }
        System.out.println(sum);
    }
}
