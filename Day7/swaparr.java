package Day7;

public class swaparr {

    public static void swap(int arr[]){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String args[]){
        int [] arr = new int[2];

        arr[0]=3;
        arr[1]=2;

        swap(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
