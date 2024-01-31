import java.util.HashMap;
import java.util.Map;

public class UsersAccount{
    private int AccountNumber;
    private int usersPin;
    private double UsersBalance;

    private static Map<Integer, User> usersAccounts ;


    public UsersAccount(){
        UsersAccount.usersAccounts = new HashMap<>();
        addUser(21001, 1234, 500.0);
        addUser(21002, 2468, 800.0);
        addUser(21003, 36912, 1000.0);

    }

    public User getUserByAccountNumber(int AccountNumber){
        return usersAccounts.get(AccountNumber);
    }

    public void addUser(int accountNumber, int userPin, double initialBalance){
        usersAccounts.put(accountNumber, new User(accountNumber, userPin, initialBalance));
    }

    public static boolean doesAccountExist(int AccountNumber){
        System.out.println("is this the one "+AccountNumber);
        return usersAccounts.containsKey(AccountNumber);
    }

    public static boolean isPinCorrect(int AccountNumber, int enteredPin){
        User user = usersAccounts.get(AccountNumber);
        return user != null && user.getusersPin() == enteredPin;
    }


    public static double getBalance(int AccountNumber){
        User user = usersAccounts.get(AccountNumber);
        return user != null ? user.getpersonalBalance() : -1;
    }

    public void updateBalance(int AccountNumber, double newBalance){
        User user = usersAccounts.get(AccountNumber);
        if(user != null){
            user.setpersonalBalance(newBalance);
        }
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
