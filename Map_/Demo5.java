package Map;

import java.util.HashMap;

public class Demo5 {
    /**
     * 案例演示：
     * HashMap集合键是Student值是String的案例
     * 键是学生对象，代表每一个学生
     * 值是字符串对象，代表学生归属地
     * @param args
     */
    public static void main(String[] args){
        HashMap<Student,String> hashMap = new HashMap<>();
        hashMap.put(new Student("张三",23),"天津");
        hashMap.put(new Student("张三",23),"北京");
        hashMap.put(new Student("李四",24),"上海");
        hashMap.put(new Student("王五",25),"黑龙江");
        hashMap.put(new Student("姜琦",26),"陕西");
        System.out.println(hashMap);
    }
}
