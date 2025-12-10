import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C or F): ");
        char unit = sc.next().toUpperCase().charAt(0);

        if (unit == 'C') {
            double f = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + f);
        } 
        else if (unit == 'F') {
            double c = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + c);
        } 
        else {
            System.out.println("Invalid unit!");
        }
    }
}
