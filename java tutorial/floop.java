import java.util.Scanner;

class floop{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("number 1");

        int a = scan.nextInt();
        System.out.println("numner 2");
        int b = scan.nextInt();
     
    System.out.println("Numbers between a to b");
    for(int i=a;i<=b;i++){
        System.out.println(i);
       
     }

    }
}