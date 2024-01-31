import java.util.Scanner;

public class ConcreteAtmMachine extends AtmMachine {
    public ConcreteAtmMachine(UsersAccount user) {
        super(user);
    }

    public static void main(String[] args) {

        UsersAccount.printUsers();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your account number: ");
        int acountNumber = scanner.nextInt();

        System.out.println("tryna match: "+ UsersAccount.doesAccountExist(acountNumber));
        if(UsersAccount.doesAccountExist(acountNumber)){

            System.out.println("Please enter your pin: ");
            int userPin = scanner.nextInt();

            if(UsersAccount.isPinCorrect(acountNumber, userPin)){
                
                UsersAccount user = new UsersAccount();
                ConcreteAtmMachine atm = new ConcreteAtmMachine(user);

                while(true){

                    System.out.println("Please select a number: \n 1. Withdrawal \n 2. Deposit \n 3. Check Balance \n 4. Quit");
                    int transaction = scanner.nextInt();

                    switch(transaction){
                        case 1:
                            System.out.println("Please enter amount: ");
                            double amount = scanner.nextInt(); 
                            atm.withdrawals(amount);
                            break;

                        case 2:
                            System.out.println("Please enter amount: ");
                            double amout = scanner.nextInt(); 
                            atm.deposits(amout);
                            break;

                        case 3:
                            atm.checkBalance();
                            break;

                        case 4:
                            System.out.println("Goodbye!");
                            System.exit(0);
                            break;

                        }
                }
            }else{
                System.out.println("Incorrect PIN. Exiting...");
            }
        }else{
            System.out.println("Account not found. Exiting...");
        }
        scanner.close();
    }
}
