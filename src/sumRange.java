import java.util.Scanner;

public class sumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number of the range: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number of the range: ");
        int second = sc.nextInt();
        int sum = 0;
        for(int i = first; i <= second; i ++){
            sum = sum + i;
        }
        System.out.println("Sum of range from "+first+" to "+second+" is: "+sum);
    }
}
