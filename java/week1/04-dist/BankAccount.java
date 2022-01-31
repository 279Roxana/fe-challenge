// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.*;
import java.util.*;

public class BankAccount { 

    int balance;

    BankAccount( int initialBalance )
    {
        balance = initialBalance;
    }

    public int getBalance()
    {
        return balance;
    }

    public void updateBalance( int newBalance )
    {
        balance = newBalance;
    }

    public int getMin()
    {
//        updateBalance(3);
        System.out.println(this.balance);
        return 0;
    }

    public int getMax()
    {
        return 0;
    }
   
}