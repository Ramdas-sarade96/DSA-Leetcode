
import java.util.*;

public class Practice {
    public static int[] replaceWithRank(int[] arr) {
        int n = arr.length;

        // Step 1: Copy array
        int[] temp = arr.clone();

        // Step 2: Sort the copied array
        Arrays.sort(temp);

        // Step 3: Assign ranks
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : temp) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Step 4: Replace elements with ranks
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};
        System.out.println(Arrays.toString(replaceWithRank(arr)));
    }
}
