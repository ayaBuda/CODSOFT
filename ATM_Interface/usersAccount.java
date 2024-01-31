import java.util.HashMap;
import java.util.Map;

public class UsersAccount{
    private int AccountNumber;
    private int usersPin;
    private double UsersBalance;

    private static Map<Integer, Integer> accountMatchPin = new HashMap<>(21001, 1234);
    private static Map<Integer, Double> accountMatchBalance = new HashMap<>();

    public UsersAccount(int AccountNumber, int usersPin, double initialBalance){
        this.AccountNumber = AccountNumber;
        this.usersPin = usersPin;
        this.UsersBalance = initialBalance;

        accountMatchPin.put(AccountNumber, usersPin);
        accountMatchBalance.put(AccountNumber, initialBalance);
    }

    public static boolean doesAccountExist(int AccountNumber){
        return accountMatchPin.containsKey(AccountNumber);
    }

    public static boolean isPinCorrect(int AccountNumber, int enteredPin){
        return accountMatchPin.get(AccountNumber) == enteredPin;
    }


    public static double getBalance(int AccountNumber){
        return accountMatchBalance.get(AccountNumber);
    }

    public int getAccountNumber(){
        return AccountNumber;
    }


    public int getusersPin(){
        return usersPin;
    }

    // public int setusersPin(){
    //     return usersPin;
    // }


    public double getUsersBalance(){
        return UsersBalance;
    }

    public void setUsersBalance(double personalBalance){
        this.UsersBalance = personalBalance;
    }

    


    
}
