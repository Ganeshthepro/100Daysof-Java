package Day10;

public class maxinarr {
    public static void main(String args[]){
        int[] arr= {2,45,67,34,98};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxVal= arr[0];
        for (int i=0;i<arr.length;i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
