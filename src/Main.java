public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(5000.0,  1423);

        System.out.println(account1.getBalance());
        account1.deposit(700.0);
        System.out.println(account1.getBalance());
        account1.withdraw(2000.0);
        System.out.println(account1.getBalance());
    }
}