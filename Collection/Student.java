package Collection;

public class Student {
    private String name;
    private int age;
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
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String toString(){
        return "Student [name=" + name + ",age=" + age + "]";
    }
}
