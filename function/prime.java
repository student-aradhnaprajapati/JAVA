import java.util.Scanner;

public class prime {

    public static boolean isPrime(int a){
        boolean flag = true;
        if(a%2 == 0){
            flag = true;
        }

        for(int i = 2; i <= a - 1; i++){
            if(a % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static  void primeNumber(int a){

        for(int i = 2; i <= a; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number that you want to check");
        int a = sc.nextInt();
             
        System.out.println("given number is :-" + isPrime(a));
        primeNumber(51);
        sc.close();
    }
}
