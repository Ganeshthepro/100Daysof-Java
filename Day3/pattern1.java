package Day3;

import java.util.*;;

public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int st = 1;
       int sp = n-1;

       for(int i = 0; i<n; i++){
        for(int j = 0; j<st; j++){
            System.out.print("* ");
        }
        for(int j = 0 ;j<sp; j++){
            System.out.print("  ");
        }
        System.out.println();
        st++;
        sp--;
       }
    }
    
}