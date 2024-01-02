package Day1;
 import java.util.*;

public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fever = sc.nextDouble();

        String s = fever>100 ? "Have fever" : "No fever";
        System.out.println(s);
        // if(fever> 100){
        //     System.out.println("Have fever");
        // } else {
        //     System.out.println("All ok");
        // }
    }
}
