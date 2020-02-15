package IO;

import java.io.*;

public class Demo11 {
    /**
     * flush()功能：具备刷新的功能，刷完之后还可以继续写
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("图片.jpg");
        FileOutputStream fos = new FileOutputStream("复制.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        //bos.flush();
        bis.close();
        bos.close();
    }
}
