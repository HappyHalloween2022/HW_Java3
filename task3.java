import java.util.ArrayList;
import java.util.Collections;

/**
 * task3
 */
public class task3 {

    public static void main(String[] args) { 
    }
    public void sortEven (ArrayList<Integer>nums){
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int elem : nums) {
            if (elem % 2 == 0) {
                evenNums.add(elem);
            }
        }
        Collections.sort(evenNums);
        int j = 0;
        for (int i = 0; i<nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                j+=2;
            }
        }
    }
}