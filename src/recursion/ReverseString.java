package recursion;
//https://leetcode.com/problems/reverse-string/
// TC = o(n) , SC = o(n)

class ReverseString {
    public void reverseString(char[] s) {
        reverseStringHelper(s, 0, s.length-1);

    }
    public void reverseStringHelper(char[] s, int left, int right){
        if(left>=right){
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverseStringHelper(s, left+1, right-1);

    }
}