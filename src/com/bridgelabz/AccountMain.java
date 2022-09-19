package com.bridgelabz;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Account account = new Account();

        while (true) {
            System.out.println("Select a option");
            System.out.println("1.show current balance");
            System.out.println("2. add Balance");
            System.out.println("3. Withdraw ");

            int press = in.nextInt();

            switch (press) {
                case 1:
                    account.showdetails();
                    break;
                case 2:
                    System.out.println("Enter the Amount to add    ::");
                    account.credit(in.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the amount for withdraw");
                    int input = in.nextInt();
                    account.withdraw(input);
                    break;
            }
        }
    }
}