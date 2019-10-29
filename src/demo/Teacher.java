package demo;
/*
归并算法
 */
public class Teacher {
    public static void main(String[] args) {
        int[] a = {1,6,17,29};
        int[] b = {2,3,5,18,20,25,28};

        int[] c = new int[a.length+b.length];
        int x,y;
        x = y = 0;
        for (int i = 0; i < c.length; i++) {
            if(x<a.length&&(y==b.length||a[x]<b[y])){
                c[i] = a[x];
                x++;
            }else{
                c[i] = b[y];
                y++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
