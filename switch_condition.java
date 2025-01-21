import java.util.Scanner;

public class switch_condition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1. create digital order list.

        System.out.println("enter order id");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("tea");
                break;
            case 3:
                System.out.println("coffee");
                break;
        
            default:
                System.out.println("sorry it is invalid order id");
                break;
        }

        //Question 2. to create an calculater.

        System.out.println("please enter first number");
        int a = sc.nextInt();

        System.out.println("please enter second number");
        int b = sc.nextInt();

        System.out.println("please enter operator that operation perform on number");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("invalid operator " + operator);
                break;
        }
        sc.close();
    }
}
