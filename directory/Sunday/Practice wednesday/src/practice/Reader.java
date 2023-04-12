package practice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {

    public void readSingleChar() throws IOException {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\InAndOut\\test.txt");
            int i = fis.read();
            System.out.println((char) i);
            fis.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public void readMultipleChars() throws IOException {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\InAndOut\\test.txt");
            int i = 0;
            String result = "";
            while ((i = fis.read()) != -1) {
                result += (char) i;
            }

            System.out.print(result);
            fis.close();

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
    public void bufferedReader() throws IOException {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\InAndOut\\test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i = 0;
            String result = "";
            while ((i = bis.read()) != -1) {
                result += (char) i;
            }

            System.out.print(result);
            fis.close();

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
