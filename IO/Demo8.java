package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("图片.jpg");
        FileOutputStream fos = new FileOutputStream("copy.jpg");
        int len = fis.available();
        System.out.println(len);
        //比较快,但是开发过程中不推荐的（因为有可能会导致内存溢出）
        byte[] arr = new byte[fis.available()];     //创建与文件一样大小的字节数组
        fis.read(arr);
        fos.write(arr);
        /*int b;
        while((b=fis.read())!=-1){          //在不断的读取每个字节
            fos.write(b);                   //写入每个字节
        }*/
        fis.close();
        fos.close();
    }
}
