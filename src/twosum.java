import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(target-nums[i])){
                  sum[0]=map.get(target-nums[i]);
                  sum[1]=i;
                  return sum;
            }
            map.put(nums[i], i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int numLength = sc.nextInt();
        int [] nums = new int[numLength];

        for (int i=0;i<numLength;i++) {
            nums[i]=sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(Arrays.toString(twoSum(nums,target)));
        sc.close();
    }
}
