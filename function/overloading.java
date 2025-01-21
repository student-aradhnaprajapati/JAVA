// concept of function overloading. function name is same but parameter are defferent or datatype are different.

import java.util.Scanner;

public class overloading {

    //here insitialize two parameter
    public static int multiply(int a, int b){
        return a * b;
    }

    //method overloading using parameter
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    //method overloading using datatype
    public static float multiply(float a, float b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a");
        int a = sc.nextInt();

        System.out.println("enter the value of b");
        int b = sc.nextInt();

        System.out.println("enter the value of c");
        int c = sc.nextInt();

        //call first method using parameter
        System.out.println("multiply := " + multiply(a, b, c));

        // call second method
        System.out.println("multiply := " + multiply(a, b));

        //call method using datatype
        System.out.println("multiply := " + multiply(a, b));

        sc.close();
    }
}
