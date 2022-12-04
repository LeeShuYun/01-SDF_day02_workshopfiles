package myapp;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class BankAccount{
    private String accountHolderName;
    private String accountNumber;
    private Float accountBalance = 0.0f;
    private List<String> transactions = new LinkedList<>();
    private Boolean accountStatus = true;
    private Date creationDate;
    private Date closingDate;
    
    //constructor to set name and account number
    public BankAccount(String name){
        this.accountHolderName = name;
        long random = (long)(Math.random() * 10000000000000000L);
        this.accountNumber = Long.toString(random);
        this.creationDate = new Date();
    }

    public void deposit(Float depositAmount){
        if (depositAmount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero");
        }else if(this.accountStatus == false){
            throw new IllegalArgumentException("Account is closed");
        }else{
            String depositDate = new Date().toString();
            String transactionEntry = "deposit $" + depositAmount + " at " + depositDate;
            setTransactions(transactionEntry);
            setAccountBalance(depositAmount);
            System.out.printf("deposit $%d at %s", depositAmount, depositDate);
        }
    }

    public void withdraw(Float withdrawalAmount){


    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        //this.accountHolderName = accountHolderName;
        System.out.println("Account user's name cannot be changed");
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountNumber() {
        System.out.println("Account number cannot be reset.");
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Float depositAmount) {
        this.accountBalance += depositAmount;
    }

    public void getTransactions() {
        for (Integer i = 0; i < transactions.size(); i++ ){
            System.out.printf("%s", transactions.get(i));
        }
    }

    public void setTransactions(String transaction) {
        this.transactions.add(transaction);
    }

    public Boolean getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Boolean accountStatus) {
        this.accountStatus = accountStatus;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        //this.creationDate = creationDate;
        System.out.println("Account creation date cannot be set");
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        //this.closingDate = closingDate;
        System.out.println("Account closing date will be set when account is closed");
    }

    
}