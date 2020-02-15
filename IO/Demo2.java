package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");//创建流对象
        int b;
        while((b=fis.read())!=-1){
            System.out.println(b);
        }
        fis.close();
    }
    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        int x = fis.read();
        System.out.println(x);
        int y = fis.read();
        System.out.println(y);
        int z = fis.read();
        System.out.println(z);
        int s = fis.read();
        System.out.println(s);
        fis.close();        //关流释放资源
    }
}
