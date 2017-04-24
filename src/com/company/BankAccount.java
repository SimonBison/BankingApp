package com.company;

/**
 * Created by Administrator on 2017-04-24.
 */
class BankAccount
{
    int balance;               // current money in the account
    int previousTransaction;   // last amount which is withdrawn or deposited
    String customerName;
    String customerId;

    void deposit(int amount)
    {
        if(amount != 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount)
    {
        if(amount != 0)
        {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction()
    {
        if(previousTransaction > 0)
        {
            System.out.println("Deposited:"+previousTransaction);
        }
        else if(previousTransaction < 0)
        {
            System.out.println("Withdrawn: "+Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No transaction occured");
        }
    }

    void showMenu()
    {


    }

}
