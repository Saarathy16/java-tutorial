import java.util.Scanner;

class sub{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five 2 digit number");
        int eng = scan.nextInt();
        int tam = scan.nextInt();
        int mat = scan.nextInt();
        int sci = scan.nextInt();
        int soc = scan.nextInt();

        int total = eng+tam+mat+sci+soc;
        int avg = total/5;

        if(avg<35)
        {
        System.out.println("addition class reguired");
        }
        else{
            System.out.println("you are good to go");
        }

    }
}