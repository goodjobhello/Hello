package demo3;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File("src/aa/a.txt");
//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(file);
//            byte[] b = new byte[10];
//            int len = inputStream.read(b);
//            while (len != -1) {
//                String s = new String(b, 0, len);
//                System.out.println(s);
//                len = inputStream.read(b);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            inputStream.close();
//        }


        try (
                OutputStream outputStream = new FileOutputStream(file,true);
        ) {
            outputStream.write("good".getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                InputStream inputStream = new FileInputStream("src/aa/b.txt");
                OutputStream outputStream = new FileOutputStream(file,true);
        ) {

            byte[] b = new byte[10];
            int len = inputStream.read(b);
            while (len!=-1){
                outputStream.write(b,0,len);
                len = inputStream.read(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
