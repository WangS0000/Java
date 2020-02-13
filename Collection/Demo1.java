package Collection;

import com.sun.org.apache.xpath.internal.objects.XObject;

/**
* 其实String[]就是引用数据类型的数组，比如说：public static void main(String[] args)*/
public class Demo1 {
    //有5个学生，把5个学生的信息存入数组中并遍历数组得到每一个学生信息
    public static void main(String[] args){
        //int[] arr = new int[5];//基本数据类型数组
        Student[] arr = new Student[5];//引用数据类型数组
        /**注意：引用数据类型数组需要重新定义toString方法，否则会返回下面的结果*/
        /**return getClass().getName() + "@" + Integer.toHexString(hashCode());*/
        arr[0]=new Student("张三",23);//创建一个学生对象，存储在数组的第一个位置
        arr[1]=new Student("李四",24);
        arr[2]=new Student("王五",25);
        arr[3]=new Student("赵六",26);
        arr[4]=new Student("姜琦",27);
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
