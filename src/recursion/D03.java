package recursion;

public class D03 {
    public static void main(String[] args){
        System.out.println(sumToN(8));
    }
    static int sumToN(int n){
        if(n==0){
            return 0;
        }
        if(n<0){
            throw new IllegalArgumentException(n +" is negative, please enter valid number");
        }
        int sum = n+sumToN(n-1);
        return sum;
    }
}
