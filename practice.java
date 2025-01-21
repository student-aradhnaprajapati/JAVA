//practice question on conditional statement.


import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1. to get a number from the user and print whether it is positive or negative.
        System.out.println("please enter a number");
        int number = sc.nextInt();

        if(number < 0){
            System.out.println("negative number");
        }else{
            System.out.println("positive number");
        }

        // Question 2. to check you have fever or not.

        System.out.println("please enter your temperature");
        double temp = sc.nextDouble();

        if(temp > 100){
            System.out.println("you have fever");
        }else{
            System.out.println("you have not fever");
        }

        //Question 3. to input week number(1-7) and print day of week name using switch case.
        System.out.println("please enter the week number");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println(day + "sunday");
                break;
        
            case 2:
                System.out.println(day + " monday");
                break;
            case 3:
                System.out.println(day + " tusday");
                break;
            case 4:
                System.out.println(day + " wedensday");
                break;
            case 5:
                System.out.println(day + "thuresday");
                break;
            case 6:
                System.out.println(day + "friday");
                break;
            case 7:
                System.out.println(day + " satarday");
                break;
        
            default:
                System.out.println(day + "invalid week number");
                break;
        }

        //Question 4. to check year leap or not
        
        System.out.println("please enter year");
        int year = sc.nextInt();

        if(year % 4 == 0){
            System.out.println(year + "this year is leap year");
        }else{
            System.out.println(year + "this is not leap year");
        }
        
        sc.close();
    }
}
