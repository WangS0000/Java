package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo10 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        byte[] arr = new byte[1024*8];
        int len;
        while((len=fis.read(arr))!=-1){         //如果忘记加arr，返回的就不是读取的字节个数，而是字节的码表值8
            fos.write(arr,0,len);
        }
        fis.close();
        fos.close();
    }
}
