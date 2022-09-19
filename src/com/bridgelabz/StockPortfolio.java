package com.bridgelabz;

import java.util.Scanner;

public class StockPortfolio 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Stock stock = new Stock();
        System.out.println("Enter the total number of Stocks");
        int no = in.nextInt();
        for (int i = 1; i <= no; i++) 
        {
            stock.addShare();
        }
        System.out.println(" Value is " + stock.getTotalPrice());
    }
}