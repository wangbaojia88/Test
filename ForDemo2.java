package cn.itcast.demo;
//案例：用For循环正向以及逆向打印数字
public class ForDemo2 {
    public static void main(String[] args) {
        //需求1：正向打印数字1~5
        //需求2：逆向打印数字5~1
        for (int i = 1;i <=5;i++) {
            System.out.println(i);
        }
        System.out.println("---------------");
        for (int i = 5;i >=1;i--) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        //传统循环
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
}
