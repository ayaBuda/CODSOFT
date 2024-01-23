public class ConcreteAtmMachine extends AtmMachine {
    public ConcreteAtmMachine(UsersAccount user) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        UsersAccount user = new UsersAccount();
        ConcreteAtmMachine atm = new ConcreteAtmMachine(user);
        atm.withdrawls(amount);
        atm.deposits(amount);
        atm.checkBalance();
    }

    @Override
    public double checkBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkBalance'");
    }
}
