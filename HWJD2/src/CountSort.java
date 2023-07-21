import java.util.TreeMap;

public class CountSort {
    public static int[] countSort(int[] arr){
        int [] tmpArr = new int[arr.length];

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int i = 0;
        for (Integer key : map.keySet()) {
            for (int j = 0; map.get(key) > j; j++) {
                tmpArr[i++] = key;
            }
        }
        return tmpArr;
    }
}
