import java.util.Map;

public abstract class AtmMachine implements IAtm{

    UsersAccount usersAccount = new UsersAccount();; 
    protected int currentAccountNo;


    public AtmMachine(UsersAccount usersAccount){
        this.usersAccount = usersAccount; 

    }

    @Override
    public double withdrawals(double amount){
        double Balance = UsersAccount.getBalance(currentAccountNo);
        if (amount <= Balance){
            Balance = Balance - amount;
            usersAccount.updateBalance(currentAccountNo, Balance);

            System.out.println(Balance);
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
        double Balance = UsersAccount.getBalance(currentAccountNo);

        // System.out.println("what is you "+usersAccount.getUserByAccountNumber(currentAccountNo));
        if( amount < 0){
            System.out.println("Deposit amount must be greater than zero.\n");
        }
        else{
            Balance = Balance + amount;
            usersAccount.updateBalance(currentAccountNo, Balance);
            System.out.println("Your money has been depositted successfully.\n");
            checkBalance();
        }
    // return Balance;
    
    return -1;
    }

    
    @Override
    public double checkBalance(){
        double balance = UsersAccount.getBalance(currentAccountNo);
        
        System.out.println("Balance: "+balance);
        return balance;}
    
}