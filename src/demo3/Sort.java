package demo3;

public class Sort {


    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < 100000000; i++) {
            array[i] = (int)(Math.random()*10000000);
        }
        long start = System.currentTimeMillis();
        quickSort(array, 0, array.length - 1);
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
//
//        int[] array2 = new int[array.length];
//        long start = System.currentTimeMillis();
//        guiBin(array, array2, 0, array.length - 1);
//        long finish = System.currentTimeMillis();
//        System.out.println(finish-start);


        //System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int index = divide(array, begin, end);
        quickSort(array, begin, index - 1);
        quickSort(array, index + 1, end);
    }

    /**
     * 划分算法
     *
     * @return
     */
    public static int divide(int[] array, int begin, int end) {
        //开时设定array[0]为第一个基准值
        int k = array[begin];

        while (begin < end) {

            while (begin < end && array[end] >= k) {
                end--;
            }
            array[begin] = array[end];

            while (begin < end && array[begin] <= k) {
                begin++;
            }
            array[end] = array[begin];
        }
        array[begin] = k;
        return begin;
    }


    /**
     * 归并算法（两个数组必须是有序的）
     */
    public static void guiBin(int[] array, int[] array2, int begin, int end) {
        if (begin == end) {
            return;
        }
        int middle = (begin + end) / 2;
        guiBin(array, array2, begin, middle);
        guiBin(array, array2, middle + 1, end);
        int x, y, z;
        x = begin;
        y = middle + 1;
        z = 0;
        for (; x <= middle || y <= end; z++) {
            if (x <= middle && (y > end || array[x] < array[y])) {
                array2[z] = array[x];
                x++;
            } else {
                array2[z] = array[y];
                y++;
            }
        }
        for (int i = begin, s = 0; i <= end; i++, s++) {
            array[i] = array2[s];
        }
    }
}
