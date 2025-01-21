import java.util.Scanner;

public class factorial {

    public static int factorialOfnumber(int x){
        int result = 1;

        for(int i = x; i >= 1; i--){
            System.out.print(i +" * ");
            result *= i;
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of x");
        int x = sc.nextInt();

        System.out.println("=" +factorialOfnumber(x));   // call the function

        sc.close();
    }
}
