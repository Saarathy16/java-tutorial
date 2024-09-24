import java.util.Scanner;
import java.lang.System;

class qq{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        int score =scan.nextInt();

        if(score>49 && score<=50)
        {
            System.out.println("You Need to improve");
        }
        if(score>50 && score<=70)
        {
            System.out.println("Good Job");
        }
        if(score>70)
        {
            System.out.println("Excellent performace");
        }
    }
}