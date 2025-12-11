import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int strength = 0;

        if (password.length() >= 8) strength++;
        if (password.matches(".*[A-Z].*")) strength++;
        if (password.matches(".*[a-z].*")) strength++;
        if (password.matches(".*[0-9].*")) strength++;
        if (password.matches(".*[!@#$%^&*()].*")) strength++;

        System.out.println("\nPassword Analysis:");

        if (strength <= 2)
            System.out.println("Strength: WEAK ❌");
        else if (strength == 3 || strength == 4)
            System.out.println("Strength: MEDIUM ⚠");
        else
            System.out.println("Strength: STRONG ✅");

        if (password.length() < 8)
            System.out.println("- Use at least 8 characters");
        if (!password.matches(".*[A-Z].*"))
            System.out.println("- Add uppercase letters");
        if (!password.matches(".*[a-z].*"))
            System.out.println("- Add lowercase letters");
        if (!password.matches(".*[0-9].*"))
            System.out.println("- Add numbers");
        if (!password.matches(".*[!@#$%^&*()].*"))
            System.out.println("- Add special characters");
    }
}
