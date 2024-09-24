       //generate the randon number until the random number is 5
    //in While loop ?

import java.util.Random;

class wl{
    public static void main(String []args){
  
    Random rand = new Random();
    //intial the num
    int newnum = 100000;
    //condition 
    while (newnum!=357091) {
       newnum= rand.nextInt(1000000);
        System.out.println(newnum);
    }
    }
}