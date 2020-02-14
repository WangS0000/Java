package StringBuilder;

public class Demo20 {
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Integer i1 = new Integer(100);
        System.out.println(i1);
        //Integer i2 = new Integer("abc");          //数字格式异常，因为abc不是数字字符串，不能将其转换为数字，所以报错
        //System.out.println("abc");
        Integer i3 = new Integer("100");
        System.out.println(i3);
    }
}
