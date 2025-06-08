import java.util.Random;
import java.util.Scanner;
public class Task1{
    public static void main(String[]args){
        Scanner n=new Scanner(System.in);
        Random rand=new Random();
        int randomNum=rand.nextInt(100)+1;
        
        int guess=0,i=0,score=100;
        System.out.println("Enter 1 if you will guess within 5 attempts");
        System.out.println("Enter 2 if you want to get score");
        int choise=n.nextInt();
        while(guess!=randomNum){
            System.out.println("enter a number to guess");
            guess=n.nextInt();
            switch(choise){
            case 1:
            if(i<5){
            if(randomNum>guess){
            System.out.println("too low");
            }
            else if(randomNum<guess){
            System.out.println("too high");
            }
            else{
                System.out.println("correct");
            }
            System.out.println(5-i+" attempts left");
            i++;
            }
            else{
                System.out.println("Guess limit exceeded");
                break;
            }
            case 2:
                 if(randomNum>guess){
            System.out.println("too low");
            if(randomNum-guess<=5){
                score=score-5;
            }
            else{
                score=score-5;
            }
            }
            else if(randomNum<guess){
            System.out.println("too high");
            if(guess-randomNum<=5){
                score=score-5;
            }
            else{
                score=score-5;
            }
            }
            else{
                System.out.println("correct");
                System.out.println("Score is"+score);
            }
            }
           
    }
}
}