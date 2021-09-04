import java.util.Scanner;

public class greatestThreeNum {
    public static void main(String[] args) {
        int first = 0,second = 0,third = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        first = sc.nextInt();
        System.out.println("Enter the second number: ");
        second = sc.nextInt();
        System.out.println("Enter the third number: ");
        third = sc.nextInt();

        if(first > second && first > third){
            System.out.println("First input is the greatest");
        }else if (second > first && second > third){
            System.out.println("Second input is the greatest");
        }else if(third > second && third > first){
            System.out.println("Third input is the greatest");
        }else{
            System.out.println("All the numbers are equal");
        }
        sc.close(); // NOT REQUIRED BUT IT'S A BEST PRACTISE
    }
}
