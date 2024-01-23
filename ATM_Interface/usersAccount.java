
public class UsersAccount{
    private int AccountNumber;
    private int usersPin;
    private double UsersBalance;

    public UsersAccount(int AccountNumber, int usersPin, double initialBalance){
        this.AccountNumber = AccountNumber;
        this.usersPin = usersPin;
        this.UsersBalance = initialBalance;
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
