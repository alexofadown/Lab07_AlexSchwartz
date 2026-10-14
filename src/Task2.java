import java.util.Scanner;

public class Task2 {
    static void main() {
        //vars
        Scanner scan = new Scanner(System.in);
        int term1 = 0;
        int term2 = 1;
        int terms = 0;
        boolean termGood = false;

        //gets # of terms
        do {
            System.out.println("How many terms do you want in your Fibonacci sequence (1-47)?");
            if (!scan.hasNextInt()) {
                System.out.println("Not an integer, try again.");
            }
            else {
                terms = scan.nextInt();
            }
            if (terms <= 0) {
                System.out.println("Not a positive number, try again.");
            }
            //disallows integer overflow
            else if (terms >= 48) {
                System.out.println("Going to 48 terms causes an integer overflow! Please try again.");
            }
            else {
                termGood = true;
            }

        } while (!termGood);

        for (int i = 0; i < terms; i++) {
            System.out.print(term1 + " ");
            //The rest of this for loop calculates the next term, and then advances term1 and term2 forward by 1 in the sequence.
            int newTerm = term1 + term2;
            term1 = term2;
            term2 = newTerm;

        }
    }
}