package myapp;

import java.util.Date;

public class Main {
    public static void main (String[] args){
        BankAccount newBankAcc = new BankAccount("John Smith");
        System.out.println(newBankAcc.getAccountBalance());
        System.out.println(newBankAcc.getAccountHolderName());
        newBankAcc.deposit(100f);
    }
}
