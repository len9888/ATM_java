import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userOption = 0;

        CheckingAccount account1 = new CheckingAccount(5000.0, 1423, 2);

        ATM atm = new ATM();

        Scanner scanner = new Scanner(System.in);

        if (account1.validatePin(scanner.nextInt())) {
            do {
                atm.menu();
                userOption = scanner.nextInt();
                switch (userOption) {
                    case 1:
                        atm.withdrawMenu();
                        double withdrawAmount = scanner.nextDouble();
                        account1.withdraw((withdrawAmount + account1.getFee()));
                        break;
                    case 2:
                        atm.depositMenu();
                        double depositCreditAmount = scanner.nextDouble();
                        account1.deposit(depositCreditAmount);
                        break;
                    case 3:
                        atm.balanceMenu(account1.getBalance());
                       // System.out.printf("\nThe interest is $%.2f", account1.calculateInterest());//saving account
                        break;
                    case 4:
                        account1.printTransactions();
                        break;
                    case 5:
                        atm.exitMenu();
                        break;
                    default:
                        atm.invalidMessageMenu();
                        break;
                }
            }
            while (userOption != 5);
        }
    }
}