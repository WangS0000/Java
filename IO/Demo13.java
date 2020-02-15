package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo13 {
    /**
     * 字节流读取中文的问题:
     *      字节流在读取中文的时候有可能读到半个中文，造成乱码
     * 字节流写出中文的问题:
     *      字节流直接操作的字节，所以写出中国必须将字符串转成字节数组
     *      写出回车换行write(“\r\n”.getBytes());
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        fos.write("哈哈哈".getBytes());
        fos.close();
    }
    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("yyy.txt");
        byte[] arr = new byte[3];
        int len;
        while((len=fis.read(arr))!=-1){
            System.out.println(new String(arr,0,len));
        }
        fis.close();
    }
}
