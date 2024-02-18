package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class twodarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int [] [] arr = new int[3] [3];
        System.out.println(arr.length);

        for(int row=0; row< arr.length; row++){
            for(int columns=0;columns<arr[row].length;columns++){
                arr[row][columns]= sc.nextInt();
            }
        }

        // for(int row=0; row< arr.length; row++){
        //     for(int columns=0;columns<arr[row].length;columns++){
        //        System.out.print(arr[row][columns]+" ");
        //     }
        //     System.out.println();
        // }

        for(int row=0; row< arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }   
}
