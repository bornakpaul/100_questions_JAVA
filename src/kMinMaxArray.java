//
// K'th largest and smallest number in an array
// Bornak Paul

import java.util.Arrays;

public class kMinMaxArray {
    static int sortArrMax(int arr[], int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
    static int sortArrMin(int arr[], int n){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int arr[] = {4,7,9,3,2,7,8,3,1,5};
        int n = arr.length;
        System.out.print("The arrays is: ");
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Largest k\'th element in the array is: " + sortArrMax(arr,n));
        System.out.println("Smallest k\'th element in the array is: " + sortArrMin(arr,n));
    }
}
