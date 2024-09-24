// any tables can print
import java.util.Scanner;

class art{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
   
    for (int i=1;i<=16;i++)
    {
        System.out.println(a+"x"+i+"="+i*a);
    }
    }
   
}