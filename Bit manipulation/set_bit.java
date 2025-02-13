import java.util.Scanner;

public class set_bit {
    public static void ith_bit(int a, int i){
        int bitMask = a << i;
        System.out.println(a | bitMask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int nums = sc.nextInt();
        System.out.println("enter the postion to set the bit : ");
        int i = sc.nextInt();

        //call the method
        ith_bit(nums, i);
        sc.close();
    }
}
