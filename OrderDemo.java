package cn.itcast.demo;
   //顺序结构流程
public class OrderDemo {
    public static void main(String[] args) {
        //顺序结构：代码会按照从上往下，从左往右的顺序，依次逐行执行
        System.out.println("程序开始执行");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println(10 + 20 + "Hello");//30Hello
        System.out.println("程序执行结束");
    }
}
