package StringBuilder;

import javax.jnlp.IntegrationService;

public class Demo19 {
    /**
     * 基本类型和包装类的对应
     * byte     ————————      Byte
     * short    ————————      Short
     * int      ————————      Integer
     * long     ————————      Long
     * float    ————————      Float
     * double   ————————      Double
     * char     ————————      Character
     * boolean  ————————      Boolean
     */
    public static void main(String[] args){
        System.out.println(Integer.toBinaryString(60)); //转成二进制
        System.out.println(Integer.toOctalString(60));  //转成八进制
        System.out.println(Integer.toHexString(60));    //转成十六进制
    }
}
