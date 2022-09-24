import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userOption = 0;

        Account account1 = new Account(5000.0, 1423);

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
                        account1.withdraw(withdrawAmount);
                        break;
                    case 2:
                        atm.depositMenu();
                        double depositCreditAmount = scanner.nextDouble();
                        account1.deposit(depositCreditAmount);
                        break;
                    case 3:
                        atm.balanceMenu(account1.getBalance());
                        break;
                    case 4:
                        atm.exitMenu();
                        break;
                    default:
                        atm.invalidMessageMenu();
                        break;
                }
            }
            while (userOption != 4);
        }
    }
}