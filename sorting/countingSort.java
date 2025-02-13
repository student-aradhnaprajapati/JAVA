import java.util.Scanner;

public class countingSort {

    // counting sorted array algortham.
    public static void counting(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            largest = Math.max(largest, a[i]);
        }
        int count[] = new int[largest + 1];

        for(int i = 0; i < a.length; i++){
            count[a[i]]++;
        }

        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                a[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // to print the array.
    public static void printArray(int a[]){
        System.out.println("sorted array : ");
        for(int arr : a){
            System.out.print(arr + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  size of the array : ");
        int n = sc.nextInt();
        
        // declare the array
        int arr[] = new int[n];

        System.out.println("enter the element the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("your input array : ");
        for(int a : arr){
            System.out.print(a + " ");
        }

        counting(arr);
        printArray(arr);
        sc.close();
    }
}
