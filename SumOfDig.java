Write a program to find the sum of digits of a number.




import java.util.Scanner;
 
public class SumOfDig{

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num : ");
        int num = sc.nextInt();

           int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

     System.out.println("sum of digite number : " + sum );

    }
}
