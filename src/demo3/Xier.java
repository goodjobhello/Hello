package demo3;

public class Xier {

    public static void main(String[] args) {
//        int[] a = {22,24,11,22,8,33,44,5,3,22,33,2,5,66};
//        //xier(a);
//        insertSort(a);
//        System.out.println(Arrays.toString(a));
    }


    /**
     * 希尔排序（插入排序的优化）
     */
    public static void xier(int[] array){
        int incr = array.length/2;
        int temp;
        while(incr >=1){
            for(int i=incr;i<array.length;i++){
                //进行插入排序
                for(int j=i;j>=incr;j=j-incr){
                    if(array[j-incr]>array[j]){
                        temp = array[j-incr];
                        array[j-incr] = array[j];
                        array[j] = temp;
                    }else{
                        break;
                    }
                }
            }
            //设置新的增量
            incr = incr/2;
        }
    }

    /**
     * 插入排序（仅仅比冒泡算法好）
     * @param array
     */
    public static void insertSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for(int j = i;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
