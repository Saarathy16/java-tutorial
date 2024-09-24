import java.util.Scanner;
class arq{
    public static void main (String []args){

    int[] a = new  int[5];
    Scanner scan = new Scanner(System.in);
     System.out.println("Enter the 5 numbers");

    for(int i=0;i<5;i++){
        a[i] = scan.nextInt();
    }
    for (int i=0;i<5;i++)
    {
        System.out.println(a[i]);
    }
    // a[0] = scan.nextInt();
    // a[1] = scan.nextInt();
    // a[2] = scan.nextInt();
    // a[3] = scan.nextInt();
    // a[4] = scan.nextInt();

    // System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
} 
   
}