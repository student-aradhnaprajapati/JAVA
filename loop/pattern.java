import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1. to print star pattern.

        System.out.println("enter the value of x");
        int x = sc.nextInt();

        for(int i = 0; i <= x; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Question 2. invert star pattern.

        System.out.println("enter the value of y");
        int y = sc.nextInt();

        for(int i = 0; i <= y; i++){
            for(int j = i; j <= y; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Question 3. to print square pattern.
        
        System.out.println("enter the value of a");
        int a =sc.nextInt();

        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                System.out.print("x");
            }
            System.out.println();
        }

        //Question 4. to print half peramid pattern.

        System.out.println("enter the value of p");
        int p = sc.nextInt();

        for(int i = 1; i <= p; i++){
            for(int j = 1; j <= i; j++){
              System.out.print(j);  
            }
            System.out.println();
        }

        //Question 5. to print charater pattern.

        System.out.println("enter the value of q");
        int q = sc.nextInt();

        char c = 'A';

        for(int i = 0; i < q; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

        sc.close();
    }
}
