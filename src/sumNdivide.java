// Accenture system check assesment
// Q. input 123 , output: 20
// 1 + 2 + 3 = 6
// and 123 / 6 = 20

import java.util.Scanner;

public class sumNdivide {
    public static int acc(int n){
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int finalsum = 0;
        finalsum = n / acc(n);
        System.out.println(finalsum);
    }
}
