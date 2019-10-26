package demo1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int sum = 11;
        int[] money = {1, 3, 5};
        int[] array = new int[sum + 1];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = 0;
            } else if (i == 1 || i == 3 || i == 5) {
                array[i] = 1;
            } else if (i < money[0]) {
                array[i] = -1;
            } else {
                int number = Integer.MAX_VALUE;
                if (i>=5&&array[i-5]!=-1){
                    number = Math.min(array[i-5]+1,number);
                }
                if (i>=3&&array[i-3]!=-1){
                    number = Math.min(array[i-3]+1,number);
                }
                if (i>=1&&array[i-1]!=-1){
                    number = Math.min(array[i-1]+1,number);
                }
                array[i] = number;
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
