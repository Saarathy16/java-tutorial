import java.util.Scanner;
class array{
    public static void main (String []args){

    int[] a = new  int[5];
    Scanner scan = new Scanner(System.in);
     System.out.println("Enter the 5 numbers");
    a[0] = scan.nextInt();
    a[1] = scan.nextInt();
    a[2] = scan.nextInt();
    a[3] = scan.nextInt();
    a[4] = scan.nextInt();

    System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
} 
   
}