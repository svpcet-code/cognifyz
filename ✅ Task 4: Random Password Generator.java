import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String numbers = "0123456789";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*";

        String chars = "";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include numbers? (yes/no): ");
        if(sc.next().equalsIgnoreCase("yes")) chars += numbers;

        System.out.print("Include lowercase letters? (yes/no): ");
        if(sc.next().equalsIgnoreCase("yes")) chars += lower;

        System.out.print("Include uppercase letters? (yes/no): ");
        if(sc.next().equalsIgnoreCase("yes")) chars += upper;

        System.out.print("Include special characters? (yes/no): ");
        if(sc.next().equalsIgnoreCase("yes")) chars += special;

        if (chars.isEmpty()) {
            System.out.println("Please select at least one character type.");
            return;
        }

        String password = "";

        for(int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            password += chars.charAt(index);
        }

        System.out.println("\nGenerated Password: " + password);
    }
}
