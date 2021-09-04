import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year to check if its is/was a leap year: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("It is/was a leap year.");
        }else{
            System.out.println("It is/was not a leap year.");
        }
        sc.close();
    }
}
