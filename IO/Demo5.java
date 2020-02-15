package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("yyy.txt",true);
        fos.write(97);   //a
        fos.write(98);   //b
        fos.close();
    }
}
