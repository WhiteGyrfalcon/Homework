import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double power1 = (a+b+c)/Math.sqrt(c);
        double power2 = a-b;
        double f1 = (Math.pow(((Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2))),power1));
        double f2 = (Math.pow((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3)),power2));
        double difference = (a+b+c)/3-(f1+f2)/2;
        System.out.printf("F1 result:%.2f; F2 result:%.2f;Diff:%.2f",f1,f2,Math.abs(difference));
    }
}
