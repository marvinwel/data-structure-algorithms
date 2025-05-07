import java.util.*;

public class trailZeros {
    
    public static void main(String[] arg){
        int number = 0100000;
        System.out.println(trailingZeros(number));
    }

    //time complexity is O(n) where n is the number of trailing zeros
    public static int trailingZeros(int number){
        int result=0;
        if(number == 0) return 0;

        while(number%10 == 0){
            result++;
            number = number /10;
        }

        return result;
    }
}
