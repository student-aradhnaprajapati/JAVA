// else if  conditional statement

import java.util.Scanner;

public class else_if {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

// Question 1. to check age is what phase.
        System.out.println("please enter your age");
        int age = sc.nextInt();

        if(age > 18 && age < 40){
            System.out.println("you are adult");
        }else if(age > 40){
            System.out.println("you are current in old age");
        }else if(age < 14){
            System.out.println("you are child");
        }else{
            System.out.println("you are teenager");
        }
    
        // Question 2. income tax calculater
        System.out.println("please enter you income");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            System.out.println("you will pay 0% tax");
            tax = 0;
            System.out.println("your total tax to pay " + tax);
        }
        else if(income > 500000 && income < 1000000){
            System.out.println("you will pay 20% tax");
            tax = (int) (income * 0.2);
            System.out.println("your total tax to pay " + tax);
        }
        else{
            System.out.println("you will pay 30% tax");
            tax = (int)(income * 0.3);
            System.out.println("your total tax to pay " + tax);
        }

        // Question 3. print the leargest to 3 number.

        System.out.println("enter first number");
        int num1 = sc.nextInt();
        
        System.out.println("enter second number");
        int num2 = sc.nextInt();

        System.out.println("enter third number");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("this is largest number of two number" +num1);
        }else if (num2 >= num1 && num2 >= num3){
            System.out.println("this is largest number of two number" +num2);
        }else{
            System.out.println("this is largest number of two number" +num3);
        }


        sc.close();
    }
}
