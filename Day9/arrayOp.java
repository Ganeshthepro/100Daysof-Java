package Day9;

import java.util.Scanner;


public class arrayOp {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[size];
        for(int i=0;i<size;i++){
            sum[i] = arr1[i]+arr2[i];
        }

        for(int value:sum){
            System.out.println(value);
        }
    
    }
}
