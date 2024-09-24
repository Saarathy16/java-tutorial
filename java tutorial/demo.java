import java.util.Scanner;

class demo{

    public static void main (String args [])
    {
        Scanner scan = new Scanner(System.in);
      
        int score = scan.nextInt();

         if(score>=35 && score<60){
            System.out.println("I can get video game");
        }
         else if(score>=60 && score<90){
            System.out.println("I can get Iphone");
        }
         else if(score>=90){
            System.out.println("I can get MacBook Pro");
        }
        // else{
        //     System.out.println("Go and read well");
        // }

    }



        


        




        
}
