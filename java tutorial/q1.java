import java.util.Scanner;
import java.lang.System;

class q1{
     public static void main(String args[])
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name");
        String name = scan.nextLine();
        System.out.println("Age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Address");
        String address = scan.nextLine();
        System.out.println("My Name is "+ name+"\n"+ "My age is "+ age+ "\n"+"My address is "+ address);
     }
}