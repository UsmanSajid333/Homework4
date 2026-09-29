package Task4.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Area = " + area);
    }
}
