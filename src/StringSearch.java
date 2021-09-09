// Cognizant Question

//A sample code is given, if the code has correct numbers of on and off curly braces,
//return the output accordingly

import java.util.Scanner;

public class StringSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a code below to check if the on & off brackets are of equal number or not: ");
        String str = sc.nextLine();
        int count1 = 0, count2 = 0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == '{'){
                count1 = count1 + 1;
            }
            else if(str.charAt(i) == '}'){
                count2 = count2 + 1;
            }
        }
        if(count1 == count2){
            System.out.println("Correct numbers of \"{ }\"");
            System.out.println("The number of \"{\" are : "+ count1 + " and the number of \"}\" are: "+ count2);
        }else{
            System.out.println("InCorrect numbers of \"{ }\"");
            System.out.println("The number of \"{\" are : "+ count1 + " and the number of \"}\" are: "+ count2);
        }
        sc.close();
    }
}
