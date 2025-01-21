// ternary operator used
//variable = (condition)? statement1 : statement2

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        //Question 1. check student fail or pass.
        System.out.println("please enter your marks");
        int num = sc.nextInt();

        String status = (num >= 33)? "Pass" : "Fail";
        System.out.println("your status is : " + status); 

        sc.close();

    }
}
