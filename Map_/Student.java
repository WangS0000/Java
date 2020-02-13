package Map;

public class Student implements Comparable<Student>{
    private String name ;
    private int age ;
    public Student(){
        super();
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Student [ name:"+name+" age:"+age+" ]";
    }

    @Override
    public int compareTo(Student o) {//以年龄为主要条件,姓名为次要条件
        int num = this.age - o.age;
        return num==0 ? this.name.compareTo(o.name):num;
    }
}
