class SavingAccount extends Account{
    public double minBalance = 2/100;
    SavingAccount(double balance) {
        this.balance = balance;
    }
    void yearlyCharge(){
        System.out.println("Yearly charge 5%");
        double charge = this.balance * 5 / 100;
        this.balance = this.balance - charge;
    }
    
    void loan(){
        double loanAmount = this.balance * 50 / 100;
        this.balance = this.balance + loanAmount;
        System.out.println("Loan Given: " + loanAmount);
    }
    
    void withdraw(double amount){
        double afterWithdrawBalance = this.balance - amount; // 0
        double check = (this.balance * ( this.minBalance));
        
        // System.out.println(check);
        if(check <= afterWithdrawBalance){
            this.balance -= amount;
            System.out.println("Success");
        } else{
            System.out.println("Balance not Enough");
        }
    }
}
