import java.util.Scanner;
import java.lang.System;

class hellow{
    public static void main(String args[])
{
   Scanner j = new Scanner(System.in);
   Scanner o = new Scanner(System.in);
   System.out.println("Name");
    String s = j.nextLine();
    System.out.println("Age");
   int a = j.nextInt();
  System.out.println("Address");
  String f = o.nextLine();
   System.out.println( "Name :"+s +"\n"+"Age :"+ a + "\n"+"Address :"+f);

}
}


