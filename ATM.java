
import java.util.Scanner;

public class ATM {
    
    static double balance = 100.00;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do{
            displayMenu();
            System.out.println("Chooes the options");
             choice = sc.nextInt();

             switch(choice) {
                case 1:
                checkBalance();
                break;
                case 2:
                 System.out.print("Enter the amount to deposit: ");
                double dep = sc.nextDouble();
                deposit(dep);
                break;
                case 3:
                System.out.print("Enter the amount to withdraw: ");
                double wd = sc.nextDouble();
                withdraw(wd);
                break;
                case 4:
                System.out.println("Thank You For Using The ATM!");
                break;
                default:
                System.out.println("Invalid choice!");
                break;
                
             }
             System.out.println();
        } while (choice != 4);

        sc.close();
    }

    static void displayMenu() {
        System.out.print("1. Check Balance: ");
        System.out.print("2. Deposit: ");
        System.out.print("3. Withdraw: ");
        System.out.print("4.Exit");

    }


    static void checkBalance(){
        System.out.println("Your Balance is: " + balance);
    }


    static void deposit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("Successfully Deposit!");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    static void withdraw(double amount) {
        if (amount > balance ) {
            System.out.println("Insufficiient Balance");
        } else if ( amount <= 0) {
            balance -= amount;
            System.out.println("Invalid withdrawal amount");
        } else {
            System.out.println("Sucessful Withdrawal");
        }
    }
}