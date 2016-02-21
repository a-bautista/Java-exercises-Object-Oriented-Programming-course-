
public class BankAccount {

    private int balance = 100;
    public int getBalance(){
        return balance;
    }
    public synchronized void withdraw(int amount){
        balance = balance - amount;
    }
}
