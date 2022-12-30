import java.util.ArrayList;

/**
 * task2
 */
public class task2 {

    public static void name(String[] args) {
    }
    public boolean isNumCountEquals(ArrayList<Integer> nums1, ArrayList<Integer>nums2, int num) {

        int count = 0;
        for (int elem : nums1) {
            if (elem == num) {
                count++;
            }
        }

        for (int elem : nums2) {
            if (elem == num) {
                count--;
            }
        }
        
       return count == 0;
            
    }

}