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

    // creating constructor to display the welcome message for the user
    BankAccount(String cname, String cid)
    {
        customerName = cname;
        customerId = cid;
    }

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
        char option='\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome" +customerName);
        System.out.println("Your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do
        {
            System.out.println("=============================================================");
            System.out.println("Enter an option");
            System.out.println("=============================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option)
            {

                case 'A':
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Balance = " +balance);
                    System.out.println("-----------------------------------------------------");
                    System.out.println("\n");
                    break;

            }
        }


    }

}
