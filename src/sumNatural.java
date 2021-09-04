import java.util.Scanner;

public class sumNatural {
    public static void main(String args[]){
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum = sum + i;

        }
        System.out.println("Sum of "+ n + " natural numbers is/are: "+ sum);
    }
}
