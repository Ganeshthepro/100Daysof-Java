package Day6;

import java.util.Scanner;

public class rightdegreePyramid {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n;i++){
            for(int j=0;j<=2*i-1;j++){
                if (j%2==0) {
                    System.out.print(i);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
