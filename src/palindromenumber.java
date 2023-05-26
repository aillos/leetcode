import java.util.Scanner;

public class palindromenumber {
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int reverse = 0;
        int x1 = x;
        while (x!=0){
            reverse = reverse*10 + x%10;
            x /= 10;
        }
        return (x1==reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
        sc.close();
    }
}
