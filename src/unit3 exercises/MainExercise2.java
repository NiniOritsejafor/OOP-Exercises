package unit3;

public class MainExercise2 {
    public static void main(String[] args) {
        Checking a1 = new Checking("Winston",1234);
        System.out.println("Checking Account number: " + a1.getNumber());
        System.out.println("Checking Account holder: " +a1.getName());
        System.out.println("Checking Account balance: " +a1.getBalance());
        a1.deposit(152.15);
        System.out.println("Checking Account balance: " +a1.getBalance());
        a1.withdraw(52.15);
        System.out.println("Checking Account balance: "+a1.getBalance());

        Savings s2 = new Savings("Winston",5678,1000,0.03);
        System.out.println("Savings account balance: "+s2.getBalance());
        System.out.println("Savings Account interest: "+s2.accumulateInterest(30));
        System.out.println("Savings Account balance: "+s2.getBalance());


    }
}
