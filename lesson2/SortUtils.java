/**
 * SortUtils
 */
public class SortUtils {

    // сортировка выбором
    public static void directSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int saveIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[saveIndex]) {
                    saveIndex = j;

                }
            }

            if (saveIndex != i) {
                int buf = array[i];
                array[i] = array[saveIndex];
                array[saveIndex] = buf;
            }
        }
    }

    public static void quikSort(int[] array) {
        if (array == null) {
            return;
        }
        quikSort(array, 0, array.length - 1);
    }

    private static void quikSort(int[] array, int start, int end){
        int left = start;
        int right = end;
        int middle = array[(start + end)/ 2]; // Значение опорного элемента
        
        do{
            while (array[left] < middle){
            left++;
        }

            while (array[right] > middle) {
                right--;
            }

            if (left <= right) {
                if(left < right){
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
            }
            left++;
            right--;
            }
        }
        while(left <= right);


        if (left < end) {
            quikSort(array, left, end);
        }
        if (start < right) {
            quikSort(array, start, right);
        }

    }
}