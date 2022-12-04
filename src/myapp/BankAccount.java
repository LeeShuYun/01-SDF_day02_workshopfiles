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
    
    //constructors ===========================================================================
    public BankAccount(String name){
        this.accountHolderName = name;
        long random = (long)(Math.random() * 10000000000000000L);
        this.accountNumber = Long.toString(random);
        this.creationDate = new Date();
    }

    public BankAccount(String name, Float accountBalance){
        this.accountHolderName = name;
        long random = (long)(Math.random() * 10000000000000000L);
        this.accountNumber = Long.toString(random);
        this.creationDate = new Date();
        this.accountBalance = accountBalance;
    }

    //methods ================================================================================
    public void deposit(Float depositAmount){
        if (depositAmount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero");
        }else if(this.accountStatus == false){
            throw new IllegalArgumentException("Account is closed");
        }else{
            String depositDate = new Date().toString();
            String transactionEntry = "deposit $" + depositAmount + " at " + depositDate + "\n";
            setTransactions(transactionEntry);
            setAccountBalance(depositAmount);
            System.out.println(transactionEntry);
        }
    }

    public void withdraw(Float withdrawalAmount){
        if (withdrawalAmount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
        }else if(this.accountStatus == false){
            throw new IllegalArgumentException("Account is closed");
        }else{
            String withdrawalDate = new Date().toString();
            String transactionEntry = "withdraw $" + withdrawalAmount + " at " + withdrawalDate + "\n";
            setTransactions(transactionEntry);
            setAccountBalance(-withdrawalAmount);
            System.out.println(transactionEntry);
        }

    }
    //getters and setters ================================================================

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
        return this.accountBalance;
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