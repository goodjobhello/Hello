package demo;

import java.util.Arrays;

public class GuiBing {
    public static void main(String[] args) {
        int[] array = {1,20,9,3,44,23,99,23,10};
        int[] array2 = new int[array.length];
        guiBin(array,array2,0,array.length-1);
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void guiBin(int[]array,int[]array2,int start,int end){
        if(start==end){
            return;
        }
        int middle = (start+end)/2;
        guiBin(array, array2, start, middle);
        guiBin(array, array2, middle+1, end);
        int x = start;
        int y = middle+1;
        int z = 0;
        for(;x<=middle||y<=end;z++){
            if(x<=middle&&(y>end||array[x]<array[y])){
                array2[z] = array[x];
                x++;
            }else{
                array2[z] = array[y];
                y++;
            }
        }
        for(int i = start,s=0;i<=end;i++,s++){
            array[i] = array2[s];
        }
    }
}
