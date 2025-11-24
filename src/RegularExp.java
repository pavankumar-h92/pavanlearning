import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {
        // Example 1: Check if string contains only letters
        String input1 = "HelloWorld";
        boolean isLettersOnly = input1.matches("[A-Za-z]+");
        System.out.println("Contains only letters: " + isLettersOnly);

        // Example 2: Check if email is valid
        String email = "pavan#example.com";
        boolean isEmailValid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        System.out.println("Valid email: " + isEmailValid);

        // Example 3: Check if a phone number has 10 digits
        String phone = "98765432101";
        boolean isPhoneValid = phone.matches("\\d{10}");
        System.out.println("Valid phone number: " + isPhoneValid);


    }
}
