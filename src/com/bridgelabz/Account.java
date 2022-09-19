package com.bridgelabz;

import java.util.Scanner;

public class Account
{
    private int accountBalance;
    Scanner in = new Scanner(System.in);

    public Account()
    {
        accountBalance = 100000;
    }

    public void showdetails() 
    {
        System.out.println("account balance is " + accountBalance);
    }

    public void credit(int amount) {
        accountBalance =    accountBalance + amount;
        System.out.println("account balance is " + accountBalance);
    }

    public void withdraw(int amount) 
    {

        if (amount <= 0) 
        {
            System.out.println("Please Enter Valid Amount");
        } else if (amount > accountBalance) 
        {
            System.out.println("Invalid Fund !!");
        } else {
            accountBalance = accountBalance - amount;
            System.out.println("\nAvailable Balance is " + accountBalance);
        }
    }
}