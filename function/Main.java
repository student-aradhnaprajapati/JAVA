// find the product of any two numbers.
//other language function or java Method.
import java.util.Scanner;

public class Main{

    // here we define the Method.
    public static int product(int x , int y){          //x and y are the parameter of function that is method with paramerter
        int prod = x * y;
        return prod;      // return the product
    }
    public static void main(String[] args) {

        //initalize the scnner class to take input by user
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of x");    //take input by user
        int x = sc.nextInt();
        System.out.println("enter the value of y");    //take input by user
        int y = sc.nextInt();
         
        System.out.println(product(x, y));            //here call the method that define above and print the return value
        
        sc.close();
    }
}