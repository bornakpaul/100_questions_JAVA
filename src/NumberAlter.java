// Cognizant Question

// Take an input of integers and check the individual numbers if odd or even.
// if the input is even, add 1 else subtract 1 . 0 is considered as even and 1 as odd.

import java.util.Scanner;

public class NumberAlter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below:");
        int n = sc.nextInt();
        int temp = n;
        int result = 0;
        while (temp != 0){
            int rem = temp % 10;
            if(rem % 2 == 0){
                rem = rem + 1;
            }else if (rem == 0)
            {
                rem = rem + 1;
            }
            else{
                rem = rem - 1;
            }
            result = result * 10 + rem;
            temp = temp / 10;
        }
        int result1 = 0;
        while (result != 0){
            int rem1 = result % 10;
            result1 = result1 * 10 + rem1;
            result = result / 10;
        }
        System.out.println("The desired output is: "+result1);
    }
}
