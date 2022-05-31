public class Customer {
    private int customerId;  // Customer number
    private double maxBalance;// Customer specific maximum balance, which may not be exceeded
    private double balance; // A customer's balance, ie shopping

    public Customer() {
        customerId=0;
        maxBalance=0;
        balance=0;
    }

    public Customer(int cid, double maxB, double bal) {
        this.customerId = cid;
        this.maxBalance = maxB;
        this.balance = bal;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getMaxBalance() {
        return maxBalance;
    }

    public void setMaxBalance(double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean increase(double amount)
    {
        if(amount + balance >= maxBalance)
        {
            return false;
        }
        else
            balance += amount;
        return true;

    }

    @Override
    public String toString() {
        return "Customer{" + "customerid=" + customerId +
                ", maximum balance=" + maxBalance + ", balance=" + balance + " '}";
    }
}
