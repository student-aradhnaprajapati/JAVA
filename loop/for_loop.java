// for loop 

import java.util.Scanner;

public class for_loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");
        int n = sc.nextInt();

        for(int i = 0 ; i <= n; i++){
            System.out.println("hello loop condition");
        }

        //Question 2. print squre pattern.

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Question 3. to print the reverse of the number.
        System.out.println("enter any number");
        int num = sc.nextInt();
        while(num > 0){
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }

        // Question 4.  reverse the given number.
        System.out.println("enter an number");
        int number = sc.nextInt();
        int rev = 0;

        while(number > 0){
            int lastdigit = number % 10;
            rev = (rev*10) + lastdigit;
            number = number / 10;
        }
        System.out.println(rev);
        sc.close();
    }
}