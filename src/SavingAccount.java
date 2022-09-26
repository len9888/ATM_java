public class SavingAccount extends Account{

   private float interestRate;

    public SavingAccount(Double balance, int pin, float rate) {
        super(balance, pin);
        this.interestRate = rate;
    }

    public double calculateInterest(){
        double interest = this.getBalance() * this.interestRate;
        return interest;
    }
}
