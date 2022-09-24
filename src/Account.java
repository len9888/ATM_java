public class Account implements Transactions {


    private final int accountNumber;
    private int pin;
    private double balance;
    private static int nextID = 1001;

    public Account(Double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
        accountNumber = getNextAccountNumber();
    }

    public boolean validatePin(int pin) {
        if (this.pin == pin) {
            return true;
        } else {
            System.out.println("invalid pin");
            return false;
        }
    }

    private int getAccountNumber() {
        return accountNumber;
    }

    private static int getNextAccountNumber() {
        return nextID++;
    }

    @Override
    public boolean withdraw(double debitAmt) {
        if(balance>debitAmt){
            balance -= debitAmt;
            System.out.println("Withdraw successful.");
            return true;
        }
        else{
            System.out.println("Not enough Money.");
            return false;
        }
    }

    @Override
    public boolean deposit(double creditAmt) {
        balance += creditAmt;
        System.out.println("Deposit successful.");
        return true;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
