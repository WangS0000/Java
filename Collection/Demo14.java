package Collection;

public class Demo14 {
    public static void main(String[] args){
        /**
         * ArrayList:
         *  底层数据结构是数组，查询快，增删慢
         *  线程不安全，效率高
         * Vector:
         *  底层数据结构是数组，查询快，增删慢
         *  线程安全，效率低
         * Vector相对于ArrayList查询慢（线程安全）
         * Vector相对于LinkedList增删慢（数据结构）
         * LinkedList:
         *  底层数据结构是链表，查询慢，增删快
         *  线程不安全，效率高
         * 面试题:
         * Vector和ArrayList的区别
         *      Vector是线程安全的，效率低
         *      ArrayList是线程不安全的，效率高
         *  ArrayList和LinkedList的区别
         *      ArrayList底层是数组结构，查询和修改快
         *      LinkedList底层是链表结构的，增和删比较快，查询和修改比较慢
         *      共同点:都是线程不安全的
         */
    }
}
