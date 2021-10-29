package unit3;

public class Account {
    private String name;
    private int number;
    protected double balance;

    public Account(String name, int number){
        this.balance = 0;
        this.name = name;
        this.number= number;
    }
    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
    public double getBalance(){
        return this.balance;
    }



}
