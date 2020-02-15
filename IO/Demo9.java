package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9 {
    /**
     * 第三种拷贝
     *      定义小数组
     * @param args
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        byte[] arr = new byte[2];
        int len ;
        while((len=fis.read(arr))!=-1){
            fos.write(arr,0,len);
        }
        fis.close();
        fos.close();
    }
    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        byte[] arr = new byte[2];
        int a = fis.read(arr);      //将文件中的字节读取到字节数组中
        System.out.println(a);      //读到的有效字节个数
        for(byte b:arr) {           //第一次获取到文件上的a和b
            System.out.println(b);
        }
        System.out.println("--------------------");
        int c = fis.read(arr);  //刷新之后99把第一个97覆盖了
        System.out.println(c);
        for(byte b:arr){
            System.out.println(b);
        }
        fis.close();
    }
}
