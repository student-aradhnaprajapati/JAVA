import java.util.Scanner;

public class bubbleSort {

    // bubble sort algoritham
    public static void bubble_Sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        
    }

    // to print the array sort by algortham
    public static void printArray(int arr[]){

        for(int a : arr){
           System.out.print(a + " ");
        }

        System.out.println();
    }

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elemnt array");

        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
        bubble_Sort(arr);
        printArray(arr);
        sc.close();
    }
}
