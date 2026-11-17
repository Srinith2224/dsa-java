package recursion;
//https://leetcode.com/problems/powx-n/
// TC = o(logn) , SC = o(logn)

class PowXN {
    public double myPow(double x, int n) {
        long n1 = n;
        return myPowHelper(x,n1);
    }
    public double myPowHelper(double x, long y) {
        if(y == 0){
            return 1;
        }
        if(y < 0){
            double answer = myPowHelper(x , -y);
            return 1/answer;
        }
        if(y % 2 ==0){
            y = y/2;
            double answer = myPowHelper(x, y);
            return answer*answer;
        }
        else{
            y = y/2;
            double answer = myPowHelper(x, y);
            return answer*answer*x;
        }

    }

}