import java.util.Scanner;

public class clear_bit {
    //define the method
    public static void ith_bit(int n, int i){
        System.out.println(n & (~(1 << i)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();

        System.out.println("enter the postion : ");
        int i = sc.nextInt();

        //call the method 
        ith_bit(num, i);
        sc.close();
    }
}
