package Map_Test;

import Map.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo3 {
    /**
     * 泛型固定下边界
     * ？ super E
     * 泛型固定上边界
     * ? extends E
     * @param args
     */
    public static void main(String[] args){
        TreeSet<Student> treeSet = new TreeSet<>(new CompareByAge());//按年龄排序
        treeSet.add(new Student("张三",23));
        treeSet.add(new Student("李四",14));
        treeSet.add(new Student("王五",25));
        treeSet.add(new Student("赵六",26));
        System.out.println(treeSet);
        TreeSet<BaseStudent> treeSet1 = new TreeSet<>(new CompareByAge());
        treeSet1.add(new BaseStudent("张三",33));
        treeSet1.add(new BaseStudent("李四",13));
        treeSet1.add(new BaseStudent("王五",25));
        treeSet1.add(new BaseStudent("赵六",26));
        System.out.println(treeSet1);
    }
    public static void Demo1(){
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三",23));
        list1.add(new Student("李四",24));
        ArrayList<BaseStudent> list2 = new ArrayList<>();
        list2.add(new BaseStudent("王五",25));
        list2.add(new BaseStudent("赵六",26));
        list1.addAll(list2);
    }
}
class CompareByAge implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        int num = s1.getAge() - s2.getAge();
        return num == 0 ? s1.getName().compareTo(s2.getName()):num;
    }
}
