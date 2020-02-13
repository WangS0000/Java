package StringBuffer;

import java.util.Scanner;

public class Demo9 {
    /**
     * 案例演示
     *  需求：
     *      把字符串反转
     *  举例：
     *  键盘输入“abc”
     *  输出结果“cba”
     *  使用StringBuffer功能实现
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        StringBuffer sb = new StringBuffer(line);
        sb.reverse();
        System.out.println(sb);
    }
}
