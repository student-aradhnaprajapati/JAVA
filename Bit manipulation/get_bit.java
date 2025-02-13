import java.util.Scanner;

public class get_bit {
    //define the function
    public static void ithBit(int a, int i){
        int bitMask = 1 << i;

        if((a & bitMask) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find bit :");
        int num = sc.nextInt();

        System.out.println("enter the postion that want to find out the bit :");
        int i = sc.nextInt();
        ithBit(num, i);
        sc.close();
    }    
}
