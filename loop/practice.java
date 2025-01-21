import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1. to print table of any number.

        System.out.println("enter that number you want to print table");
        int a = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(a * i);
        }

        //Question 2.to find the factorialof any number entered by the user.
        System.out.println("enter the number to find factrial");
        int fact = sc.nextInt();
        int total = 1;

        for(int i = 1; i <= fact; i++){
             total *= i;
        }
        System.out.println(total);


        sc.close();
    }
}
