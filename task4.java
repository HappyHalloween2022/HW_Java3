import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        List<Integer> nums = List.of (1,1,1,2,2,2,5);
        ArrayList<Integer> arrayList = new ArrayList<>(nums);
        Iterator <Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
