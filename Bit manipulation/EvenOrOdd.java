//Question : check if a number is even or odd

import java.util.Scanner;

public class EvenOrOdd {

    //define the method
    public static void isCheck(int a){
        int bitMask = 1;

        //condition to check number is even or odd using and operation with bitmask
        if((a & bitMask) == 1){
            System.out.println("ODD Number");            //if condition is true
        }else{
            System.out.println("EVEN Number");            //if condition is false
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //to take number that check even or odd
        System.out.print("please !  Enter any number to check EVEN or ODD : ");
        int num = sc.nextInt();

        isCheck(num);       // call the method
        sc.close();
    }
}
