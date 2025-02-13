import java.util.Scanner;

public class update_bit {
    public static int clear_bit(int n, int i){
        return (n & (~(1 << i)));
    }

    public static int set_bit(int n, int i){
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static void ith_bit(int n, int i, int newBit){
        if(newBit == 0){
            System.out.println(clear_bit(n, i));
        }else{
            System.out.println(set_bit(n, i));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number : ");
        int num = sc.nextInt();

        System.out.println("enter the postion :");
        int i = sc.nextInt();

        System.out.println("enter the bit you want to update : ");
        int newBit = sc.nextInt();

        //call the method
        ith_bit(num, i, newBit);

        //second method
        // num = clear_bit(num, newBit);
        // int bitMask = newBit << i;
        // System.out.println(num | bitMask);
        sc.close();
    }
}
