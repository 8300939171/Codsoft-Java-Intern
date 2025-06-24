import java.util.Scanner;
public class task2{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int nos=n.nextInt();
        int total_mark=0;
        for(int i=1;i<=nos;i++){
            System.out.println("Enter the mark scored in subject "+i);
            int nosi=n.nextInt();
            total_mark=total_mark+nosi;
        }
        System.out.println("total marks is "+total_mark);
        int average=total_mark/nos;
        System.out.println("average is "+average);
        if(average>85){
            System.out.println("Grade A");
        }
        else if(average>65){
            System.out.println("Grade B");
        }
        else if(average>45){
            System.out.println("Grade C");
        }
    }
}
