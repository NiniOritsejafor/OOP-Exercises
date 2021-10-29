package unit3;

public class Savings extends Account {
    private static double InterestRate;

    public Savings(String name,int number,double balance, double InterestRate){
        super(name,number);
        this.balance = balance;
        Savings.InterestRate = InterestRate;



    }
    public double accumulateInterest(int x){
        double interest = 0;
        interest= Math.round((balance * InterestRate* x)*100)/100;
        balance = balance + interest;
        return interest;
    }

}
