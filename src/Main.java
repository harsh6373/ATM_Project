import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int balance = 5000, withdraw, deposit;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("-:Welcome To H ATM :-");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = scanner.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = scanner.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println("Remaining Balance is :"+" ₹ "+balance);
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = scanner.nextInt();
                    balance = balance + deposit;
                    System.out.println(" ₹ "+deposit+" has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : "+" ₹ "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}