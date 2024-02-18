package Day8;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        
   
    ArrayList<Integer> list = new ArrayList<>(5);

    list.add(56);
    list.add(78);
    list.add(14);
    list.add(12);
    list.add(5);

    System.out.println(list);

    list.set(1,45);

    System.out.println(list);
    }

    
}
