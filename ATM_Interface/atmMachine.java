
public abstract class AtmMachine implements IAtm{

    protected  UsersAccount usersAccount; 
    static double Balance = 100.00;
    static double amount;
    // public static void main(String[] args) {
    //     atmMachine atm = new atmMachine();
    //     atm.withdrawls(amount);
    // }


    public AtmMachine(UsersAccount usersAccount){
        this.usersAccount = usersAccount;
        withdrawls(30);
        deposits(20);
        

    }

    @Override
    public double withdrawls(double amount){

        if (amount <= Balance){
            Balance = Balance - amount;
            System.out.println(Balance);
            System.out.println("Please collect your money.");
            return Balance;

        } 
        else{
            System.out.println("Insufficient Funds.");
        }
        System.out.println(Balance);
        return Balance;
    }

    @Override
    public double deposits(double amount){
        if( amount < 0){
            System.out.println("Deposit amount must be greater than zero.");
        }
        else{
            Balance = Balance + amount;
            System.out.println("Your money has been depositted successfully.");
        }
        System.out.println(Balance);
        return Balance;
    }
}