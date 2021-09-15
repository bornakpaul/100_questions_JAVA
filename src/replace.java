// Replace all 0's with 5 in given Array

public class replace {
    public static int convertFive(int num){
        String n = String.valueOf(num);
        n = n.replaceAll("0","5");
        return Integer.parseInt(n);
    }
    public static void main(String args[]){
        int num = 302005;
        System.out.println(convertFive(num));
    }
}


