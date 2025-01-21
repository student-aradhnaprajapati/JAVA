import java.util.Scanner;

public class Binomial {

    public static int factorial(int x){
        int res = 1;
        for(int i = x; i >= 1; i--){
            res *= i;
        }
        return res;
    }

    public static int binomal(int a, int b){
        int fact_a = factorial(a);
        int fact_b = factorial(b);
        int fact_amb = factorial(a - b);

        int result = fact_a/(fact_b * fact_amb);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a");
        int a = sc.nextInt();

        System.out.println("enter the value of b");
        int b = sc.nextInt();

        System.out.println("Binomial cofficient := "+ binomal(a, b));

        sc.close();
    }
}
