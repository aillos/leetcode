class Solution {
    public int reverse(int x) {
        int reverse=0;
         while (x != 0){
            int digit = x % 10;
            int temp = reverse * 10 + digit;
                if ((temp - digit) / 10 != reverse) {
                     return 0;
                }
            
            reverse = temp;
            x/=10;
         }
         return reverse;
    }
}
