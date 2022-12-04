package myapp;

import java.util.Date;

public class Main {
    public static void main (String[] args){
        BankAccount newBankAcc = new BankAccount("Peter Parker");
        System.out.println(newBankAcc.getAccountBalance());
        System.out.println(newBankAcc.getAccountHolderName());
        newBankAcc.deposit(300f);
        newBankAcc.withdraw(50f);
        newBankAcc.getTransactions();
        System.out.println(newBankAcc.getAccountBalance());

        BankAccount secondBankAcc = new BankAccount("Mary Jane+balance", 2000f);
        System.out.println(secondBankAcc.getAccountHolderName());
        secondBankAcc.deposit(100f);
        secondBankAcc.withdraw(10f);
        secondBankAcc.getTransactions();
        System.out.println(secondBankAcc.getAccountBalance()); 

        FixedDepositAccount fixedJamesAcc = new FixedDepositAccount("James Jonah Jameson+balance", 10000f);
        FixedDepositAccount fixedKentAcc = new FixedDepositAccount("Clark Kent+balance+interest", 2568f, 1.6f);
        FixedDepositAccount fixedLuthorAcc = new FixedDepositAccount("Lex Luthor+balance+interest+duration", 11111f, 3.5f, 10);
        System.out.printf(" Name: %s, Duration: %d, Interest: %.2f\n", fixedJamesAcc.getAccountHolderName(), fixedJamesAcc.getDuration(), fixedJamesAcc.getInterest());
        fixedJamesAcc.deposit(10f);
        fixedJamesAcc.withdraw(10f);
        fixedJamesAcc.getBalance();
        System.out.println("Changing interest to 5f and duration to 10.");
        fixedJamesAcc.setInterest(5f);
        fixedJamesAcc.setDuration(10);
        System.out.printf(" Name: %s, Duration: %d, Interest: %.2f\n", fixedJamesAcc.getAccountHolderName(), fixedJamesAcc.getDuration(), fixedJamesAcc.getInterest());
        System.out.println("trying to change interest and duration to 3f 11, should trip exceptions");
        fixedJamesAcc.setInterest(3f);
        fixedJamesAcc.setDuration(11);
    }
}
