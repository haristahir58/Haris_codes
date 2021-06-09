import java.io.Serializable;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ATM_Account implements Serializable {
    private double Balance = 600000;
    private double AccountNumber;
    private String name;


    Scanner scan = new Scanner(System.in);

    public ATM_Account(String name, double accountNum) {
        super();
        this.name = name;
        this.AccountNumber = accountNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "\nATM_Account{" + "Account Name: "+name+", AccountNumber='" + AccountNumber + '\'' + ", Balance=" + Balance + '}' + "\n";
    }

    public double getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public double getBalance() {
        return (double) Balance;
    }

    public void setBalance(int bankBalance) {
        this.Balance += bankBalance;
    }

    public void WithDraw() {

        System.out.println("\nPlease Enter Withdrawn Amount ");
        int cash = scan.nextInt();
        Balance -= cash;
        System.out.println("Cash is successfully withdrawn!! \nRemaining balance is " + Balance);

    }

    public void deposit() {

        System.out.println("\nPlease Enter Deposit Amount: ");
        int cash = scan.nextInt();
        Balance += cash;
        System.out.println("Cash is successfully Deposited!! \nRemaining balance: " + Balance);

    }

    public void InquiryBalance() {
        double balance = getBalance();
        System.out.println("Current Balance left: " + balance);
    }

    public void Transfer(ATM_Account to, ATM_Account from) {

        System.out.println("\nPlease Enter Amount to transfer: ");
        int cash = scan.nextInt();
        to.setBalance((int) (Balance + cash));
        from.setBalance((int) (Balance - cash));
        System.out.println(cash + " Your Amount is successfully transferred!!!! ");

    }



    public static void writeFile(ArrayList<ATM_Account> record) {
        FileOutputStream bookStream;
        try {

            bookStream = new FileOutputStream("E:\\Account.txt");
            ObjectOutputStream objectStream = new ObjectOutputStream(bookStream);
            objectStream.writeObject(record.toString());
            objectStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readFile(ArrayList<ATM_Account> record) {

        try {
            FileInputStream inputStream = new FileInputStream("E:\\Account.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            System.out.println(objectInputStream.readObject());

            objectInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}