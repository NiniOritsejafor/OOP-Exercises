package unit3;

public class Checking extends Account {
    public Checking(String name, int number) {
        super(name, number);
    }



    public void deposit(double x ) {
        balance += x;
    }
    public void withdraw(double x) {
        balance -= x;
    }



}
