import java.util.Scanner;

public class Task3 {
    static void main() {
        //vars
        Scanner scan = new Scanner(System.in);
        double savingsGoal = 0;
        double nextDeposit = 0;
        double totalSaved = 0;
        double excess;
        int numberOfDeposits = 0;
        boolean savingsGoalGood = false;
        boolean nextDepositGood;
        boolean savingsGoalMet = false;

        //disclaimer
        System.out.println("Please note that all amounts of money printed will be truncated to two decimals.");

        //gets savings goal
        do {
            System.out.println("What's your savings goal?");
            if (!scan.hasNextDouble()) {
                System.out.println("Not a number. Perhaps you accidentally included a dollar sign.");
                scan.nextLine();
            }
            else {
                savingsGoal = scan.nextDouble();
            }
            if (savingsGoal <= 0) {
                System.out.println("Not a positive number.");
            }
            else {
                savingsGoalGood = true;
            }
        } while (!savingsGoalGood);

        while (!savingsGoalMet) {
            System.out.printf("Your current total is $%1.2f \n", totalSaved);
            
            //ensures nextDepositGood is false again
            nextDepositGood = false;
            //gets the next deposit
            do {
                System.out.println("How much is the next deposit?");
                if (!scan.hasNextDouble()) {
                    System.out.println("Not a number. Perhaps you accidentally included a dollar sign.");
                    scan.nextLine();
                }
                else {
                    nextDeposit = scan.nextDouble();
                }
                if (nextDeposit <= 0) {
                    System.out.println("Not a positive number.");
                }
                else {
                    nextDepositGood = true;
                    numberOfDeposits += 1;
                }
            } while (!nextDepositGood);

            //adds the next deposit to the total saved, checks whether the loop should end yet (goal is met) or not
            totalSaved += nextDeposit;
            if (totalSaved >= savingsGoal) {
                savingsGoalMet = true;
            }
            else {
                System.out.println("Getting closer!");
            }
        }
        //calculates excess and prints info
        excess = totalSaved - savingsGoal;
        System.out.println("Number of Deposits: " + numberOfDeposits);
        System.out.printf("Total saved $%1.2f \n", totalSaved);
        System.out.printf("Excess: $%1.2f", excess);

    }
}