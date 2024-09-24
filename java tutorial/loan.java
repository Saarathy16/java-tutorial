import java.util.Scanner;

class loan {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your salary");
        int Salary = scan.nextInt();
         System.out.println("enter your age");
        int age = scan.nextInt();
    

        if(Salary>=20000 || age<25)
        {
            System.out.println("eligible for loan");
             System.out.println("enter loan amount ");
            int loan = scan.nextInt();
           
            if(50000>loan){
                System.out.println("loan available");
                
            }
            else{
                System.out.println("loan not available");
            }
        }
        else{
            System.out.println("no loan");
        }

    }
}

