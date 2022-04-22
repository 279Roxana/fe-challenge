// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.*;
import java.util.*;

public class BankAccount { 

    int balance;
    ArrayList<Integer> balanceHistory = new ArrayList<>(balance);

    BankAccount( int initialBalance )
    {
        balance = initialBalance;
        balanceHistory.add(balance);

    }

    public int getBalance()
    {
        return balance;
    }

    public void updateBalance( int newBalance )
    {
        balance = newBalance;
        balanceHistory.add(balance);

    }

    public int getMin()
    {
        int min = balanceHistory.get(0);
        for (int i = 0; i < balanceHistory.size(); i++){
            if (balanceHistory.get(i) < min){
                min = balanceHistory.get(i);
            }
        }
        return min;
    }

    public int getMax()
    {
        int max = balanceHistory.get(0);
        for (int i = 0; i < balanceHistory.size(); i++){
            if (balanceHistory.get(i) > max){
                max = balanceHistory.get(i);
            }
        }
        return max;
    }
   
}