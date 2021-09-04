import java.util.Scanner;

public class greatestNum {
    public static void main(String args[]){
        int first = 0,second =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        first = sc.nextInt();
        System.out.println("Enter the second number: ");
        second = sc.nextInt();

        if (first > second){
            System.out.println("First number is greater than the second number.");
        }else if(second > first){
            System.out.println("Second number is greater than the first number.");
        }else{
            System.out.println("Both the number entered is equal.");
        }
    }
}
