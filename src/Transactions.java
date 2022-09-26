import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Transactions {
    boolean withdraw(double debitAmt);
    boolean deposit(double creditAmt);
    double getBalance();
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy:MM:dd - hh:mm:ss");

    static boolean recordTransaction(double transactionAmt, String transactionType){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.txt", true))){
            writer.write((transactionType == "Credit")? "\n\tAmount credited: $" + transactionAmt + "\t Date: " + LocalDateTime.now().format(dateTimeFormatter)
                                                            :"\n\tAmount debited:  $" + transactionAmt + "\t Date: " + LocalDateTime.now().format(dateTimeFormatter));
        } catch (IOException e) {
            System.out.println("Error occurred writing to file");
            e.printStackTrace();
        }return true;
    }
}
