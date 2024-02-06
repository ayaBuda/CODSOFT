import java.util.Map;

public class User {
    private int accountNumber;
    private int userPin;
    private double personalBalance;

    public User(int accountNumber, int userPin, double personalBalance ){
        this.accountNumber = accountNumber;
        this.userPin = userPin;
        this.personalBalance = personalBalance;

    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getusersPin(){
        return userPin;
    }

    public double getpersonalBalance(){
        return personalBalance;
    }

    public void setpersonalBalance(double personalBalance){
        this.personalBalance = personalBalance;
    }



   
}
