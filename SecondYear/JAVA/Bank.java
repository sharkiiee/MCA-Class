
import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    private long accountNumber;
    private String name;
    private int balance;
    private long contact;
    Bank(){
        accountNumber = 0;
        balance = 0;
        name = null;
        contact = 0;
    }

    public void getValue(){

        System.out.println("Enter Your name :");
        name = scanner.next();
        System.out.println("Enter Your account number");
        accountNumber = scanner.nextLong();
        System.out.println("Enter Your contact number");
        contact = scanner.nextLong();
        System.out.println("Enter the starting balance");
        balance = scanner.nextInt();
    }

    public void deposit(){
        System.out.println("Enter the amount you want to deposit");
        balance += scanner.nextInt();
        showBalance();
    }

    public void showBalance(){
        System.out.println("Total amount of the balance : " + balance);
    }

    public void withdrawlAmount(){
        System.out.println("Enter the amount You want to withdrawl");
        int wBalance = scanner.nextInt();
        if(balance < wBalance){
            System.out.println("Insufficient amount please try again");
        }else{
            balance -= wBalance;
        }
        showBalance();
    }

    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.getValue();
        obj.deposit();
    }
}
