import java.util.Scanner;

public class CompoundInterst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        int p = input.nextInt();

        System.out.print("Enter rate of interst: ");
        float r = input.nextFloat();

        System.out.print("Enter time period: ");
        float t = input.nextFloat();

        double comInterest = p * Math.pow((1 + r / 100), t);

        System.out.println("Compound interest is " + comInterest);

    }
}
