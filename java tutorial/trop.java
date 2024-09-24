import java.util.Scanner;

class trop{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System. out.println("enter two integer value");
        int a = scan.nextInt();
        int b = scan.nextInt();
    //     boolean rain = scan.nextBoolean();

    // // boolean rain = true;
    // String result = rain?"take an umbrelila":"enjoy sunlight";
    // System. out.println(result);

        String result = (a>b)? "a is greater": "b is greater";
        System. out.println(result);

    }
}