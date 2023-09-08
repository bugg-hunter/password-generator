import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Aadhaar card number: ");
        String aadhaar = scanner.next();

        StringBuilder password = new StringBuilder();

        for (char ch : name.toCharArray()) {
            password.append(ch);
            password.append("@"); // Special character
        }
        String ageString = String.valueOf(age);
        for (char ch : ageString.toCharArray()) {
            password.append(ch);
            password.append("#"); // Special character
        }

      
        for (char ch : aadhaar.toCharArray()) {
            password.append(ch);
            password.append("$"); // Special character
        }


        System.out.println("Generated password: " + password);
    }
}
