import java.util.Scanner;

public class atm {
    int balance = 0;
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        atm account = new atm(); 
        account.balance=10000;
        System.out.println("select the fuction");
         System.out.println("withdraw-1");
         System.out.println("deposit-2");
         System.out.println("check balace-3");
         int function=n.nextInt();
        switch(function){
            case 1 -> {
                System.out.println("enter the amount to withdraw");
                int tamount=n.nextInt();
                if((account.balance-tamount)<5000){
                    System.out.println("Insufficient balance");
                }
                else{
                    account.balance=account.balance-tamount;
                    System.out.println("amount withdrawn");
                    System.out.println("avalable balance - "+account.balance);
                }
            }
            case 2 -> {
                System.out.println("enter the amount to be deposited");
                int tamount = n.nextInt();
                account.balance=account.balance+tamount;
                System.out.println("amount deposited");
                System.out.println("avalable balance - "+account.balance);
            }
            case 3 -> System.out.println("available balance - "+account.balance);
        }
    }
}
