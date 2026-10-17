//Question 3 a  corrected abstract class Account
public abstract class Account {
    private double balance;
    public double interest () {
        return balance * 0.05;
    }
    public abstract void close ();
}
