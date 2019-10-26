package demo;

public class Test {


    public static void main(String[] args) {
//        int number = 5;
//        int m = 0;
//        int n = number;
//        boolean flag = true;
//        for (;n<=number;) {
//            for (int i = 0; i < m; i++) {
//                System.out.print(" ");
//            }
//            for (int i = 0; i < n; i++) {
//                System.out.print("* ");
//            }
//
//            if(n==1){
//                flag = false;
//            }
//
//            if(flag){
//                m++;
//                n--;
//            }else{
//                m--;
//                n++;
//            }
//            System.out.println();
//        }
        int m = 0;
        int n = 5;
        for(int j = 0;j<5;j++){
            for (int i = 0; i < m; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            m++;
            n--;
            System.out.println();
        }
    }
}
