//import java.util.HashMap;
//import java.util.Map;
//
//public class UsersAccount{
////    private int accountNumber;
//    private static Map<Integer, User> usersAccounts ;
//    protected int currentAccountNo;
//
//
//    static{
//        usersAccounts = new HashMap<>();
//        addUser(21001, 1234, 500.0);
//        addUser(21002, 5678, 8000.0);
//        // setCurrentAccountNo(21001);
//    }
//
//
//
//    public static Map<Integer, User> getUsersDetails(){
//        return usersAccounts;
//    }
//
////    private static void addUser(int accountNumber, int userPin, double initialBalance) {
////        usersAccounts.put(accountNumber, new User(accountNumber, userPin, initialBalance));
////
////    }
//
//    private static void addUser(int accountNumber, int pin, double balance) {
//        User user = new User(accountNumber, pin, balance);
//        System.out.println("does this have something? "+user);
//        usersAccounts.put(accountNumber, user);
//    }
//
//
//    public static void printUsers(){
//        System.out.println("users in system: ");
//        for (Map.Entry<Integer, User> entry : usersAccounts.entrySet()) {
//            User user = entry.getValue();
//            System.out.println("Account Number: " + user.getAccountNumber() +
//                               ", PIN: " + user.getusersPin() +
//                               ", Balance: " + user.getpersonalBalance());}
//    }
//
//    public User getUserByAccountNumber(int AccountNumber){
//        return usersAccounts.get(AccountNumber);
//    }
//
//
//    public static boolean doesAccountExist(int AccountNumber){
//        // System.out.println("Let me seee "+ usersAccounts);
//        // System.out.println("is this the one "+AccountNumber);
//        return usersAccounts.containsKey(AccountNumber);
//    }
//
//    public static boolean isPinCorrect(int AccountNumber, int enteredPin){
//        User user = usersAccounts.get(AccountNumber);
//        return user != null && user.getusersPin() == enteredPin;
//    }
//
////
//
//
//
////     public static double getBalance(int accountNumber){
////         // int user = User.getAccountNumber() ;
////         User user = usersAccounts.get(accountNumber);
////         System.out.println("user. "+user);
////         return user != null ? user.getpersonalBalance() : -1;
////     }
//
////    public static double getBalance(int accountNumber) {
////        System.out.println("Account Number to search: " + accountNumber);
////
////        for (Map.Entry<Integer, User> entry : usersAccounts.entrySet()) {
////            User user = entry.getValue();
////            if (user.getAccountNumber() == accountNumber) {
////                System.out.println("User found: " + user);
////                return user.getpersonalBalance();
////            }
////        }
////
////        System.out.println("User not found for Account Number: " + accountNumber);
////        return -1;
////    }
//
//    public static double getBalance(int accountNumber) {
//        System.out.println("Account Number to search: " + accountNumber);
//
//        for (Map.Entry<Integer, User> entry : usersAccounts.entrySet()) {
//            User user = entry.getValue();
//            System.out.println("AccNo. " + user.getAccountNumber());
//
//            if (user.getAccountNumber() == accountNumber) {
////                System.out.println("User found: " + user);
////                System.out.println("come onn: " + user.getAccountNumber());
//                return user.getpersonalBalance();
//            }
//        }
//
//        System.out.println("User not found for Account Number: " + accountNumber);
//        return -1;
//    }
//
////    public double getBalance(){
//////        User user;
//////        double bal = User.getpersonalBalance();
//////         int user = User.getAccountNumber() ;
////        System.out.println("user. "+bal);
////        return bal;
////    }
//
//    public void updateBalance(int accountNumber, double newBalance){
//        User user = usersAccounts.get(accountNumber);
//        if(user != null){
//            user.setpersonalBalance(newBalance);
//        }
//    }
//
//    // public int getAccountNumber(){
//    //     return AccountNumber;
//    // }
//
//    public int getAccountNumber(int accountNumber) {
//        User user = usersAccounts.get(accountNumber);
//        return user != null ? user.getAccountNumber() : -1;
//    }
//
//    // public int getusersPin(){
//    //     return usersPin;
//    // }
//
//    public int getPin(int accountNumber) {
//        User user = usersAccounts.get(accountNumber);
//        return user != null ? user.getusersPin() : -1;
//    }
//
//    // public double getUsersBalance(int accountNumber){
//    //     User user = usersAccounts.get(accountNumber);
//    //     return UsersBalance;
//    // }
//
//    // public void setUsersBalance(double personalBalance){
//    //     this.UsersBalance = personalBalance;
//    // }
//
//     public void setCurrentAccountNo(int accountNumber){
//         this.currentAccountNo = accountNumber;
//         System.out.println("come onn: "+this.currentAccountNo);
//
//     }
//
//
//
//
//
//
//
//
//
//}
