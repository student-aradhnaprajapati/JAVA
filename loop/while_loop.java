// while loop using

import java.util.Scanner;

public class while_loop {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        // Question 1.
        System.out.println("please enter number how many number of time you print ");
        int number = sc.nextInt();

        while(number < 100){
            System.out.println("hello");
        }

        //Question 2. print number form 1 to 10.
        int count = 1;

        while(count <= 10){
            System.out.println(count);
            count++;
        }

        //Question 3. print number from 1 to n.

        System.out.println("enter the value of n");
        int n = sc.nextInt();

        int a = 1;

        while(a <= n){
            System.out.println(a);
            a++;
        }

        //Question 4. Sum of first n natural number.

        System.out.println("enter the value of n");
        int n1 = sc.nextInt();

        int b = 1;
        int sum = 0;
        while(b <= n1){
            System.out.println(b);
            b++;
            sum = sum + b;
        }
        System.out.println("total := " + sum); 

        sc.close();
    }
}
