import java.util.HashMap;
import java.util.Map;

public abstract class AtmMachine implements IAtm{


    protected int currentAccountNo;
    private User user;

    private static Map<Integer, User> usersAccounts ;



    static{
        usersAccounts = new HashMap<>();
        addUser(21001, 1234, 500.0);
        addUser(21002, 5678, 8000.0);
        addUser(21003, 36912, 0.0);

    }



    public static Map<Integer, User> getUsersDetails(){
        return usersAccounts;
    }



    private static void addUser(int accountNumber, int pin, double balance) {
        User user = new User(accountNumber, pin, balance);
        usersAccounts.put(accountNumber, user);
    }


    public static void printUsers(){
        System.out.println("users in system: ");
        for (Map.Entry<Integer, User> entry : usersAccounts.entrySet()) {
            User user = entry.getValue();
            System.out.println("Account Number: " + user.getAccountNumber() +
                    ", PIN: " + user.getusersPin() +
                    ", Balance: " + user.getpersonalBalance());}
    }

    public User getUserByAccountNumber(int AccountNumber){
        return usersAccounts.get(AccountNumber);
    }


    public static boolean doesAccountExist(int AccountNumber){
        return usersAccounts.containsKey(AccountNumber);
    }

    public static boolean isPinCorrect(int AccountNumber, int enteredPin){
        User user = usersAccounts.get(AccountNumber);
        return user != null && user.getusersPin() == enteredPin;
    }



    public static double getBalance(int accountNumber) {
        // System.out.println("Account Number to search: " + accountNumber);

        for (Map.Entry<Integer, User> entry : usersAccounts.entrySet()) {
            User user = entry.getValue();

            if (user.getAccountNumber() == accountNumber) {
                return user.getpersonalBalance();
            }
        }

        System.out.println("User not found for Account Number: " + accountNumber);
        return -1;
    }


    public void updateBalance(int accountNumber, double newBalance){
        User user = usersAccounts.get(accountNumber);
        if(user != null){
            user.setpersonalBalance(newBalance);
        }
    }



    public int getAccountNumber(int accountNumber) {
        User user = usersAccounts.get(accountNumber);
        return user != null ? user.getAccountNumber() : -1;
    }


    public int getPin(int accountNumber) {
        User user = usersAccounts.get(accountNumber);
        return user != null ? user.getusersPin() : -1;
    }


    public void setCurrentAccountNo(int accountNumber){
        this.currentAccountNo = accountNumber;
    }




    public AtmMachine(User user){
        this.user = user;

    }


    @Override
    public double withdrawals(double amount){
        double Balance = getBalance(currentAccountNo);
        if (amount <= Balance){
            Balance = Balance - amount;
            updateBalance(currentAccountNo, Balance);

            System.out.println("Please collect your money.\n");
            checkBalance();
            return Balance;

        } 
        else{
            System.out.println("Insufficient Funds.\n");
        }
        System.out.println(Balance);
        return Balance;
    }

    @Override
    public double deposits(double amount){
        double Balance = getBalance(currentAccountNo);

        if( amount < 0){
            System.out.println("Deposit amount must be greater than zero.\n");
        }
        else{
            Balance = Balance + amount;
            updateBalance(currentAccountNo, Balance);
            System.out.println("Your money has been depositted successfully.\n");
            checkBalance();
        }
    return -1;
    }

    @Override
    public double checkBalance(){
        double balance = getBalance(currentAccountNo);
        System.out.println("Balance: "+balance+"\n");
        return balance;}
    
}