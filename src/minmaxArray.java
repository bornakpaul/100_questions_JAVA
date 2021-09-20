// The min and max element of an array.
public class minmaxArray {
    static int getMax(int arr[], int n){
        int res = arr[0];
        for(int i = 1; i < n; i++){
            res = Math.max(res, arr[i]);
        }
        return res;
    }
    static int getMin(int arr[], int n){
        int res = arr[0];
        for(int i=1; i<n; i++){
            res = Math.min(res, arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,9,5,7};
        int n  = arr.length;
        System.out.print("The arrays is: ");
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("The max element of the array is: " + getMax(arr,n));
        System.out.println("The min element of the array is: " + getMin(arr,n));

    }
}
