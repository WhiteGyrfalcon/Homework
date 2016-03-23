import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] numbers = new String[input.length()];
        numbers=input.split("\\s+");
        if(numbers.length%2==0) {
            for (int i = 0; i <numbers.length; i += 2) {
                if (Integer.parseInt(numbers[i]) % 2 == 0 && Integer.parseInt(numbers[i + 1]) % 2 == 0) {
                    System.out.println("both are even");
                } else if (Integer.parseInt(numbers[i]) % 2 != 0 && Integer.parseInt(numbers[i + 1]) % 2 != 0) {
                    System.out.println("both are odd");
                } else if ((Integer.parseInt(numbers[i]) % 2 != 0 ^ Integer.parseInt(numbers[i + 1]) % 2 != 0)) {
                    System.out.println("different");
                }
            }
        }
        else System.out.println("Invalid length");

    }
}
