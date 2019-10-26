package demo1;

public class Test1 {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int n = 360;
        for (int i = 0; i < n/90; i++) {
            array = swap(array);
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }

    public static int[][] swap(int[][] array){
        int[][] newArray = new int[array[0].length][array.length];
        int x = 0;
        int y = array.length-1;
        for (int i = 0; i < newArray.length; i++) {
            for(int j =0;j<newArray[i].length;j++){
               newArray[i][j] = array[y][x];
               y--;
            }
            y = array.length-1;
            x++;
        }
        return newArray;
    }
}
