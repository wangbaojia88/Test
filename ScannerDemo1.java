package cn.itcast.demo;
//第一步：导包
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //第二步：创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //给出提示
        System.out.println("请输入一个整数：");
        //第三步：接收数据
        int i = sc.nextInt();//此代码执行时，控制台会等待用户录入数据

        //把获取的数据输出
        System.out.println("i:" + i);
    }
}
