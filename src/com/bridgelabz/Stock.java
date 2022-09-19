package com.bridgelabz;

import java.util.Scanner;

public class Stock {

    private int noOfStocks;
    private String shareName;
    private int noOfShare;
    private double sharePrice;
    static double stockPrice;
    static double totalPrice;

    public double getTotalPrice()
    {
        return totalPrice;
    }

    public void addShare() 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Name of Share");
        shareName = in.next();
        System.out.println("number of Share");
        noOfShare = in.nextInt();
        System.out.println("price ");
        sharePrice = in.nextDouble();
        stockPrice = noOfShare * sharePrice;
        totalPrice = totalPrice + stockPrice;
        System.out.println("Value of Stock " + shareName + " is = " + stockPrice);

    }

}