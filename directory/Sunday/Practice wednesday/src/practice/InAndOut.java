package practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InAndOut {

    public static void main(String[] args) throws IOException {
        Writer writer = new Writer();
        //writer.writeSingleChar();

        Reader reader = new Reader();
        //reader.readSingleChar();

       //writer.writeMultipleChars();
       //reader.readMultipleChars();

        writer.bufferWriter();
        reader.bufferedReader();




    }
}
