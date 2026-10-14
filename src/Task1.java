import java.util.Scanner;

public class Task1 {
    static void main() {
        //vars
        Scanner scan = new Scanner(System.in);
        String userString;
        String newString = "";

        System.out.println("What's the string you want to check?");
        userString = scan.nextLine();

        //constructs the string backwards
        for (int i = userString.length(); i > 0; i--) {
            String currentChar = userString.substring(i-1, i);
                newString += currentChar;
        }

        //checks if new backward string is the same as original forward string
        if (newString.equals(userString)) {
            System.out.println(userString + " is a palindrome.");
        }
        else {
            System.out.println(userString + " isn't a palindrome.");
        }

    }
}