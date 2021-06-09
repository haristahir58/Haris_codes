import java.util.ArrayList;

public class Runner_Lab14 {
    public static void main(String[] args) {
        ATM_Account account1 = new ATM_Account("Haris", 111);
        ATM_Account account2 = new ATM_Account("Zohaib", 190);
        ATM_Account account3 = new ATM_Account("Ali", 187);
        ATM_Account account4= new ATM_Account("Umair", 169);
        ATM_Account account5 = new ATM_Account("Shahzaib", 129);
        ATM_Account account6 = new ATM_Account("Ayaaz", 149);
        ATM_Account account7 = new ATM_Account("nazish", 139);
        ATM_Account account8 = new ATM_Account("rashid", 129);
        ATM_Account account9 = new ATM_Account("Wahab", 119);
        ATM_Account account10 = new ATM_Account("Hassan", 90);


        // Calling Arraylist
        ArrayList<ATM_Account> account_user = new ArrayList<ATM_Account>();

        // Adding 10 objects
        account_user.add(account1);
        account_user.add(account2);
        account_user.add(account3);
        account_user.add(account4);
        account_user.add(account5);
        account_user.add(account6);
        account_user.add(account7);
        account_user.add(account8);
        account_user.add(account9);
        account_user.add(account10);

        // Adding those 10 objects in a file
        ATM_Account.writeFile(account_user);


        // Calling functions
        account8.deposit();
        account6.InquiryBalance();
        account10.WithDraw();
        account1.Transfer(account2, account3);

        System.out.println(account1.toString());
    }



    }




