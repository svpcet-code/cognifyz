import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word or sentence: ");
        String input = sc.nextLine();

        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverse = "";
        for(int i = clean.length() - 1; i >= 0; i--) {
            reverse += clean.charAt(i);
        }

        if(clean.equals(reverse)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not Palindrome ❌");
        }
    }
}
