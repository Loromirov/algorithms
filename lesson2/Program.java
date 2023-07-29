import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        /* 
        int[] array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        SortUtils.directSort(array);
        ArrayUtils.printArray(array);

        System.out.println();

        array = ArrayUtils.prepareArray(); 
        ArrayUtils.printArray(array);

        SortUtils.quikSort(array);
        ArrayUtils.printArray(array);

        array = ArrayUtils.prepareArray(200000);
        long startTime = System.currentTimeMillis();
        SortUtils.directSort(array.clone());
        long endTime = System.currentTimeMillis();
        System.out.printf("Время работы сортировки выбором %d мс.\n", endTime - startTime);

        startTime = System.currentTimeMillis();
        SortUtils.quikSort(array.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы быстрой сортировки %d мс.\n", endTime - startTime);
                
        startTime = System.currentTimeMillis();
        Arrays.sort(array.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы системной сортировки%d мс.\n", endTime - startTime);
        */


        int[] array = ArrayUtils.prepareArray(20);
        ArrayUtils.printArray(array);

        long startTime = System.currentTimeMillis();
        HeapSort.sort(array);
        long endTime = System.currentTimeMillis();
        ArrayUtils.printArray(array);

        System.out.printf("Время работы пирамидальной сортировки%d мс.\n", endTime - startTime);


       }


}
