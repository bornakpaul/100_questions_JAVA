import java.util.Scanner;

public class Even {
    public static void main(String args[]){
        System.out.print("Enter a number : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is an even integer.");
        }else
            System.out.println(num + " is an odd integer.");
    }
}
