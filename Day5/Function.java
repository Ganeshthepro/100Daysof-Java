package Day5;

import java.util.*;

public class Function {

    public static boolean isEven(int x){
        if (x%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (isEven(x)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
