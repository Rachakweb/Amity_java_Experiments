import java.util.Scanner;

public class NameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        try {
            // Call the validateName method to check if the name is valid
            validateName(name);
            System.out.println("Name is valid: " + name);
        } catch (InvalidNameException e) {
            // Handle the InvalidNameException by displaying an error message
            System.out.println("Invalid Name: " + e.getMessage());
        }

        scanner.close();
    }

    // Method to validate the name
    static void validateName(String name) throws InvalidNameException {
        for (char c : name.toCharArray()) {
            // Check if the character is a digit (numeric value)
            if (Character.isDigit(c)) {
                // If a numeric character is found, throw an InvalidNameException
                throw new InvalidNameException("Name contains a numeric value.");
            }
        }
    }
}

// Custom exception class for invalid names
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}
