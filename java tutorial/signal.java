import java.util.Scanner;

class signal{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
       

        if(color.equals("red"))
        {
            System.out.println("stop");
        }
        if(color.equals("yellow"))
        {
            System.out.println("ready");
        }
        if(color.equals("green"))
        {
            System.out.println("go");
        }
    }
}