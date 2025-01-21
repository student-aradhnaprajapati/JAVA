// if-else conditional statement


import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Question 1.  find the person is elidgible.

        System.out.println("please enter your age :");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("you are elidgble");
        }
        if (age >= 13 && age <= 18) {
            System.out.println("sorry you are not elidgble. you are teeneger.");
        } else {
            System.out.println("you are child");
        }

// Question 2. print the largest number of 2 numbers.
            
            System.out.println("please enter first number");
            int a = sc.nextInt();

            System.out.println("please enter second number");
            int b = sc.nextInt();

            if(a > b){
                System.out.println("largest number is " + a);
            }else{
                System.out.println("largest number is " + b);
            }

//Question 3. print number is odd or even.
            System.out.println("enter any number to cheack that is even or odd");
            int num = sc.nextInt();

            if(num%2 == 0){
                System.out.println(num + " " +"This number is even");
            }else{
                System.out.println(num + " " +" This number is odd");
            }
        sc.close();
    }
}



