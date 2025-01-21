// do - while loop
import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1. use of do-while loop with break keyword.
        System.out.println("enter the value of n");
        int n  = sc.nextInt();

        int cout = 1;
        do{
            System.out.println("hello");
            if(cout == n/2){
                break;
            }
            cout++;
        }while(cout < n);

        //Question 2. keep entering number till user enter a multiple of 10. with countiue keyword.
        
       do{
        System.out.println("enter number");
        int num = sc.nextInt();
        if(num % 10 == 0){
            break;
        }
        if(num == num/2){
            continue;
        }
        System.out.println(num);

       }while(true);

       //Question 3. display all number entered by user except multiple of 10.

       do{
        System.out.println("enter number");
        int a = sc.nextInt();

        if(a % 10 ==0){
            continue;
        }
        System.out.println(a);
       }while(true);

    // Question 4. check if a number is prime or not.
    // System.out.println("enter an number");
    // int number = sc.nextInt();

    // boolean isPrime = true;
    // if(number == 2){
    //     System.out.println("prime number");
    // }else{
    //     for(int i = 2; i <= number - 1; i++ ){
    //         if(number % i ==  0){
    //             isPrime = false;
    //             continue;
    //         }
    //     }
    //     if(isPrime == true){
    //         System.out.println("prime");
    //     }else{
    //         System.out.println("not prime");
    //     }

    //    }
        
    }
}
