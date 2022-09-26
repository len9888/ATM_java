public class CheckingAccount extends Account{

    private double fee;

    public CheckingAccount(Double balance, int pin, double fee) {
        super(balance, pin);
        this.fee = fee;
    }

    public double getFee(){
        return this.fee;
    }
}
