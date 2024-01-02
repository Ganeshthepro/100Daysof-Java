package Day1;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double year = sc.nextDouble();

        if (year % 4 ==0) {
            if (year %100 == 0) {
                if (year% 400 ==0) {
                    System.out.println("Leap");
                    
                } else{
                    System.out.println("non leap");
                }
                
            } else {
                System.out.println(" leap");
            }
            
        }else {
             System.out.println(" non leap");
        }
       
    }
}
