package Day8;

import java.util.Arrays;

public class updatearr {
    public static void main(String args[]){
        int num[]= new int[5];
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change( int [] arr) {
        arr[0] = 99;
    }
}
