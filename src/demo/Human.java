package demo;

import java.util.Arrays;

/*
 一段长度为x的钢条，价格为px(x为正整数)
 		价格表如下：
 		长度x   1  2  3  4  5   6   7   8   9   10
 		价格px  1  5  8  9  10  17  17  20  24  30
*/
public class Human {

    public static void main(String[] args) {
        int n = 10;
        int[] price = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int[] maxPrice = new int[n + 1];
        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < maxPrice.length; j++) {
                if (i >= j) {
                    maxPrice[i] = Math.max(maxPrice[i],maxPrice[i-j]+price[j]);
                }
            }
        }
        System.out.println(Arrays.toString(maxPrice));
    }

}
