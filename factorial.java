public class factorial {
    
    public static void main(String[] arg){

        System.out.println(factorialNumber(5));
        System.out.println(factorialRecursion(5));
    }

    //5 = 1*2*3*4*5
    //time complexity O(n)
    //space complexity O(1)
    public static int factorialNumber(int number){

        int value = 1;

        for(int i=2;i<=number;i++){
            value = value*i;
        }
        return value;
    }

    //recursion
    //time complexity O(1)
    //space complexity O(n)
    public static int factorialRecursion(int number){
        //base case
        if(number == 0) return 1;

        return number * factorialRecursion(number-1);
    }
}
