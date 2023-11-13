abstract class bank {
    int accNo;
    double balance;
    String acc_holderName;
    String branchName;
    String address;
    
    abstract void createAcc();

    bank(int accNo,double balance,String acc_holderName,String branchName,String address){
        this.accNo = accNo;
        this.balance = balance;
        this.acc_holderName = acc_holderName;
        this.branchName = branchName;
        this.address = address;
    }
}
interface Accounts{
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
}
class SavingsAccount extends bank implements Accounts{
    double intertRate;
    SavingsAccount(int accNo,double balance,String acc_holderName,String branchName,String address,double intertRate){
        super(accNo, balance, acc_holderName, branchName, address);
        this.intertRate = intertRate;
    }
    @Override
    void createAcc(){
        System.out.println("Account created.");
    }

    @Override
    
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: "+amount);
    }

    @Override
    
    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: "+ amount);
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }
    public double calculateInterest(){
        double interest = balance * (intertRate/100.0);
        return interest;
    }
    public void viewBalance(){
        System.out.println(accNo);
        System.out.println(acc_holderName);
        System.out.println(branchName);
        System.out.println(address);
        System.out.println(balance);
    }
}
class Innerbank {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(12345, 1000.0, "John Doe", "Main Branch", "123 Main St", 5.0);
        s.createAcc();
        s.viewBalance();

        s.deposit(500.0);
        s.viewBalance();

        s.withdraw(100.0);
        s.viewBalance();

        double interest = s.calculateInterest();
        System.out.println("Interest Earned: " + interest);
    }
}
