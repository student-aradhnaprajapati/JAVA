import java.util.Scanner;

public class selectionSort {

    // selection sort algoritham implementaion
    public static void selection(int a[]){

        for(int i = 0; i < a.length - 1; i++){
            int minNum = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[minNum] > a[j]){
                    minNum = j;
                }
            }

            //swap
            int temp = a[minNum];
            a[minNum] = a[i];
            a[i] = temp;
        }

    }

    // to print the array
    public static void printArray(int a[]){
        System.out.println("sorted array :");
        for(int arr : a){
            System.out.print(arr + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0; i <= n - 1; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("input array :");
        for(int arr : a){
            System.out.print(arr + " ");
        }
        System.out.println();

        selection(a);
        printArray(a);
        sc.close();
    }
}
