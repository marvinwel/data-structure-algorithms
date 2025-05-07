import java.util.Scanner;

public class palindromeNumber {

    public static void main(String[] arg){
        
        //hardcode value
        //System.out.print(palindrome(7337));
        
        //read in user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in a number");
        int number = in.nextInt();
        System.out.println(palindrome(number));
    }

    //time complexity = O(n)
    public static boolean palindrome(int number){
        
        int rev =0;
        int temp = number;

        while(temp > 0){

            int lastDigit = temp%10;
            rev = rev*10+lastDigit;
            temp = temp/10;
        }

        return rev == number ? true:false;
    }
}