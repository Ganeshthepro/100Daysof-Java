package Day10;

public class searchinginarr {
    static int linearSearch(int arr[], int k) {
        if(arr.length ==  0){
            return -1;
        }

        for (int i =0; i<arr.length;i++){
            if(arr[i]==k){
                return i+1;
            }
        }

        return -1;
    }

    public static void main(String [] args){
        int[] arr = {123,13,31,313,42,5,6346,67,542,41,1,51,34,26,4,2,3,5};
        int k = 26;
        int sol = linearSearch(arr, k);
        System.out.println(sol);
    }
    
}
