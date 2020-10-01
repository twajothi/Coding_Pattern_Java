import java.util.*;
public class pairwisewithmap {

    public static int[] search(int [] arr, int targetSum ){
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            if (nums.containsKey(targetSum - arr[i] )){
                return new int[] {targetSum - arr[i], arr[i]};
            }else {
                nums.put(arr[i], i);
            }

        }


    return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] result = pairwisewithmap.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = pairwisewithmap.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }

}
