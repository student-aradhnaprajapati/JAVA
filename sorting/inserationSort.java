import java.util.Scanner;

public class inserationSort {

    public static void inseration(int a[]){
        for(int i = 1; i < a.length; i++){
            int curr = a[i];
            int prev = i - 1;
            // to select the position  for insertion element
            while(prev >= 0 && a[prev] > curr){
                a[prev + 1] = a[prev];
                prev--;
            }

            // to insert the element
            a[prev + 1] = curr;
        }
    }

    // to print the array.
    public static void printArray(int a[]){
        System.out.println("sorted array is  :");
        for(int arr : a){
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    //main function 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println("enter the element of the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("your input array is : ");
        for(int a : arr){
            System.out.println(a + " ");
        }

        inseration(arr);
        printArray(arr);
        sc.close();
    }
}
