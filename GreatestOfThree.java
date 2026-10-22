import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println("First number is Greatest!");
        }

        else if (b >= a && b >= c) {
            System.out.println("Second number is Greatest!");
        }

        else {
            System.out.println("Third number is Greatest!");
        }

    }
}
