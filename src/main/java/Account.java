abstract class Account {
    protected double balance;
    public double chargeRate;
    public double loanRate;
    
    void deposit(double amount){
        this.balance += amount;
    }
    
    abstract void withdraw(double amount);
    
    double getBalance(){
        return this.balance;
    }
}
