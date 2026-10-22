import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmatic calculator\n");

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int addition = first + second;
        System.out.println("Addition: " + addition);

        int substraction = first - second;
        System.out.println("Substraction:" + substraction);

        int multiplication = first * second;
        System.out.println("Multiplication:" + multiplication);

        int division = first / second;
        System.out.println("Division:" + division);

        int modulas = first % second;
        System.out.println("Modulas:" + modulas);
    }
}
