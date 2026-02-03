Write a program to print multiplication table of a number




import java.util.Scanner;
public class multable {
    

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);

         System.err.println("enter a num :");
        int n = sc.nextInt();


         for (int i= 1; i<=10; i++)

            System.err.println(i*n);


    }
}
