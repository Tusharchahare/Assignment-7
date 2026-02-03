Write a program to check if a number is prime.


import java.util.Scanner;

public class CheckPriNo {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("enter a num : ");
        int n =  sc.nextInt();

        int a = 0;

        for (int i=2 ; i<n ; i++){
                for (int j=2 ; j<=n ;j++ ){

                    if(i*j==n){

                        a=1;

                    }
                }
        }

        if (a>0){
            System.out.println("not prime : " + n);
        }
        else{
            System.out.println("prime number : ");
        }


    }
    
}
