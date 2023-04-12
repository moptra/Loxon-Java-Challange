package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {

    public void writeSingleChar() throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\InAndOut\\test.txt");
             fos.write(65);
            fos.flush();
            fos.close();
            System.out.println("Készen vagyok");
        } catch (FileNotFoundException e) {
            System.out.println("" + e);
        } catch (IOException e) {
            System.out.println("" + e);;
        }

    }

    public void writeMultipleChars() throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\InAndOut\\test.txt");
            String text = "San Fransiscobol jottem";
            byte byteArray[] = text.getBytes();
            fos.write(byteArray);
            fos.flush();
            fos.close();
            System.out.println("Készen vagyok");
        } catch (FileNotFoundException e) {
            System.out.println("" + e);
        } catch (IOException e) {
            System.out.println("" + e);;
        }

    }
}
