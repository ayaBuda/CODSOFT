
public abstract class AtmMachine implements IAtm{

    protected  UsersAccount usersAccount; 
    // static double Balance = 0.00;
    // static double amount;


    public AtmMachine(UsersAccount usersAccount){
        this.usersAccount = usersAccount; 

    }

    @Override
    public double withdrawals(double amount){
        double Balance = usersAccount.getUsersBalance();
        if (amount <= Balance){
            Balance = Balance - amount;
            usersAccount.setUsersBalance(Balance);

            System.out.println(Balance);
            System.out.println("Please collect your money.\n");
            checkBalance();
            // return Balance;

        } 
        else{
            System.out.println("Insufficient Funds.\n");
        }
        System.out.println(Balance);
        return Balance;
    }

    @Override
    public double deposits(double amount){
        double Balance = usersAccount.getUsersBalance();
        if( amount < 0){
            System.out.println("Deposit amount must be greater than zero.\n");
        }
        else{
            Balance = Balance + amount;
            usersAccount.setUsersBalance(Balance);
            System.out.println("Your money has been depositted successfully.\n");
        }
        checkBalance();
        return Balance;
    }

    
    @Override
    public double checkBalance(){
        double Balance = usersAccount.getUsersBalance();
        System.out.println("Balance: " +Balance+ "\n");
        return Balance;
    }
}