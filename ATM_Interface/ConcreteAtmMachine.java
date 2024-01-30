import java.util.Scanner;

public class ConcreteAtmMachine extends AtmMachine {
    public ConcreteAtmMachine(UsersAccount user) {
        super(user);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your account number: ");
        int acountNumber = scanner.nextInt();

        System.out.println("Please enter your pin: ");
        int userPin = scanner.nextInt();

        UsersAccount user = new UsersAccount(acountNumber, userPin,  Balance);
        ConcreteAtmMachine atm = new ConcreteAtmMachine(user);

        System.out.println("Please select a number: \n 1. Withdrawal \n 2. Deposit \n 3. Check Balance \n 4. Quit");
        int transaction = scanner.nextInt();

        switch(transaction){
            case 1:
                System.out.println("Please enter amount: ");
                double amount = scanner.nextInt(); 
                atm.withdrawls(amount);
                break;

            case 2:
             System.out.println("Please enter amount: ");
                double amout = scanner.nextInt(); 
                atm.deposits(amout);
                // break;

            case 3:
                atm.checkBalance();
                // break;

            case 4:
                break;

        }
        // atm.withdrawls(amount);
        

    }

    // @Override
    // public double checkBalance() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'checkBalance'");
    // }
}
