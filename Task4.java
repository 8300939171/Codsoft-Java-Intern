import java.util.Scanner;
public class task4{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter total base currency amount to covert");
        double amount=n.nextInt();
        System.out.println("Select the base currency");
        System.out.println("1 if rupees");
        System.out.println("2 if doller");
        System.out.println("3 if pound");
        int option=n.nextInt();
        switch(option){
            case 1 -> {
                System.out.println("Select the currency to convert");
                System.out.println("2 if doller");
                System.out.println("3 if pound");
                int choice=n.nextInt();
                switch(choice){
                    case 2 -> amount=amount/85.65;
                //System.out.println("amount is"+amount);
                    case 3 -> amount=amount/116.04;
                        //System.out.println("amount is"+amount);
                }   }
            case 2 -> {
                System.out.println("Select the currency to convert");
                System.out.println("1 if rupees");
                System.out.println("3 if pound");
                int choice = n.nextInt();
                switch(choice){
                    case 1 -> amount=amount*85.65;
                //System.out.println("amount is"+amount);
                    case 3 -> amount=amount*116.04;
                        //System.out.println("amount is"+amount);
                }   }
            case 3 -> {
                System.out.println("Select the currency to convert");
                System.out.println("1 if doller");
                System.out.println("2 if rupees");
                int choice = n.nextInt();
                switch(choice){
                    case 1 -> amount=amount/0.74;
                //System.out.println("amount is"+amount);
                    case 2 -> amount=amount*116.04;
                        //System.out.println("amount is"+amount);
                }   }
        }
        float amoun=(float)amount;
        System.out.println("amount is"+amoun);
       
    }
}
