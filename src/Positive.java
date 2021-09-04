import java.util.Scanner;

public class Positive {
    public static void main(String args[]){
        System.out.print("Enter a number to check is its odd or even : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0){
            System.out.println( num + " is an even integer.");
        }else if(num < 0){
            System.out.println(num +  " is an odd integer");
        }else
            System.out.println("You have entered" + num);
    }
}
