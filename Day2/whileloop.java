package Day2;

import java.util.Scanner;

public class whileloop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num ;
        int choice ;

        int evensum = 0;
        int oddsum = 0;

        do{
            num = sc.nextInt();

            if (num%2==0) {
                evensum += num;
            } else {
                oddsum += num;
            }

            System.out.println("Enter your choice 1 for yes and 0 for no");
            choice = sc.nextInt();

        } while(choice==1);

        System.out.println("Even sum is"+  evensum);
        System.out.println("odd sum is"+  oddsum);
    }
}