package WestTwo.Round2.Problem1;

public class InsufficientBalanceException extends RuntimeException {

    private double balance;

    public InsufficientBalanceException(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
