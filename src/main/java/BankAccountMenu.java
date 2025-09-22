import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // set scanner
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        boolean run = true;
        while(run) {
            System.out.println("---- Bank Account Menu ----");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");

            int choice = sc.nextInt();

            switch (choice)
            {
                // choice 1: add money
                case 1: {
                    System.out.println("\nEnter amount to add:  ");
                    double adding = sc.nextDouble();
                    if (adding >= 0) {
                        balance += adding;
                        System.out.println("New balance: " + balance);
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                }
                // choice 2: withdrawal money
                case 2: {
                    System.out.println("Enter amount to withdraw:  ");
                    double withdrawal = sc.nextDouble();
                    if (withdrawal <= balance && withdrawal >= 0) {
                        balance -= withdrawal;
                        System.out.println("New balance: " + balance);
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                }
                // choice 3: display current balance
                case 3:
                {
                    System.out.println("Current balance: " + balance);
                    break;
                }
                // choice 4: end program
                case 4: {
                    System.out.println("Exiting program, goodbye!");
                    run = false;
                    break;
                }
            }
        }
    }
}