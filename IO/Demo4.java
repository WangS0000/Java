package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("yyy.txt");     //创建字节输出流对象，如果没有就自动创建一个
        //FileOutputStream fos = new FileOutputStream("yyy.txt",true);     //追加
        fos.write(97);//虽然写出的是一个int数，但是到文件上的是一个字节，会自动去除前三个8位
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
