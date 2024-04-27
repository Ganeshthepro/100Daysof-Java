package Day11;

public class evendigitcount {
    public static void main(String[] args) {
        int[] num= {2,35,67,21};
        System.out.println(find(num));
    }

    static int find(int[] num){
        int count =0;
        for(int i=0; i<num.length;i++){
           if (even(num[i])) {
               count++;
           }
        }
        return count;
    }

    static boolean even(int num){
        int numofdigits = digits(num);
        return numofdigits % 2 == 0;
    }

    static int digits(int num){
        int count =0;
        while (num>0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
