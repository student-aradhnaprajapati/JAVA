import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("enter the value of b : ");
        int b = sc.nextInt();

        //And  bitwise operation
        System.out.println( " AND output : "+ (a & b));

        //OR bitwise operation
        System.out.println(" OR output : " + (a | b));

        //XOR bitwise operation
        System.out.println("XOR output : " + (a ^ b));

        //Binary one's complement
        System.out.println("One's complement output : " + (~ a));
        System.out.println("One's complement output : " + (~ b));

        //Binary left shift
        System.out.println("left shift : " + (a << b));

        //Binary right shift
        System.out.println("Right shift : " + (a >> b));
        sc.close();
    }
    
}
