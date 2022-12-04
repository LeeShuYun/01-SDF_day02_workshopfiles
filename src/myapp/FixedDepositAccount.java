package myapp;
import java.util.Date;

public class FixedDepositAccount extends BankAccount {
    private Float interest = 3f;
    private Integer duration = 6;
    private Boolean settingInterest = false;
    private Boolean settingDuration = false;

    //constructors
    public FixedDepositAccount(String name, Float balance){
        super(name, balance);
    }
    public FixedDepositAccount(String name, Float balance, Float interest){
        super(name, balance);
        this.interest = interest;
    }
    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration){
        super(name, balance);
        this.interest = interest;
        this.duration = duration;
    }

    //methods =======================================================================
    @Override
    public void deposit(Float depositAmount){
        System.out.println("NOP. No deposit allowed.");
    }

    @Override
    public void withdraw(Float withdrawalAmount){
        System.out.println("NOP. No withdrawing allowed.");
    }

    public Float getBalance(){
        return this.getAccountBalance() + ((this.interest + 100f) * this.getAccountBalance());
    }
    public Float getInterest() {
        return interest;
    }
    public void setInterest(Float interest) {
        if (settingInterest == false) {
            this.interest = interest;
        }else{
            throw new IllegalArgumentException("Sorry, no more changes allowed.");
        }
        
    }
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        if (settingDuration == false) {
            this.duration = duration;
        }else{
            throw new IllegalArgumentException("Sorry, no more changes allowed.");
        }    }
    


}
