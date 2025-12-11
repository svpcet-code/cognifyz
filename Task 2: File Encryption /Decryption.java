import java.io.*;
import java.util.Scanner;

public class FileEncryptDecrypt {

    static String transform(String text, int key) {
        String result = "";

        for (char ch : text.toCharArray()) {
            result += (char)(ch + key);
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Encrypt File");
        System.out.println("2. Decrypt File");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFile = sc.nextLine();

        System.out.print("Enter secret key (number): ");
        int key = sc.nextInt();

        if (choice == 2) key = -key;

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(transform(line, key));
            writer.newLine();
        }

        reader.close();
        writer.close();

        System.out.println("✔ Operation completed successfully!");
    }
}
