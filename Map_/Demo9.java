package Map;

import java.util.HashMap;

public class Demo9 {
    /**
     * 案例演示：
     * 集合嵌套之HashMap嵌套HashMap
     * 需求：
     * 双元课堂有很多基础班
     * 第88期基础班定义成了一个双列集合，键是学生，值是学生的归属地
     * 第99期基础班定义成了一个双列集合，键是学生，值是学生的归属地
     * 无论第88期还是第99期都是班级对象，所以为了统一管理，把这些班级对象添加到双元课堂集合中
     * @param args
     */
    public static void main(String[] args){
        //定义第88期课堂
        HashMap<Student,String> hashMap1 = new HashMap<>();
        hashMap1.put(new Student("张三",23),"北京");
        hashMap1.put(new Student("李四",24),"北京");
        hashMap1.put(new Student("王五",25),"上海");
        hashMap1.put(new Student("赵六",26),"广州");
        //定义第99期课堂
        HashMap<Student,String> hashMap2 = new HashMap<>();
        hashMap2.put(new Student("唐僧",1023),"北京");
        hashMap2.put(new Student("悟空",1024),"北京");
        hashMap2.put(new Student("八戒",1026),"上海");
        hashMap2.put(new Student("沙僧",1028),"广州");
        //定义双元课堂
        HashMap<HashMap<Student,String>,String> hashMap = new HashMap<>();
        hashMap.put(hashMap1,"第88期基础班");
        hashMap.put(hashMap2,"第99期基础班");
        for(HashMap<Student,String> h : hashMap.keySet()){
            String value = hashMap.get(h);
            for(Student key : h.keySet()){
                String value2 = h.get(key);
                System.out.println(key + "=" + value2 + "=");
            }
        }
    }
}
