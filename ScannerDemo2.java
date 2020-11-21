package cn.itcast.demo;
//计算两个整数和

//1.导包
import java.util.Scanner;                    //第一句
public class ScannerDemo2 {
    public static void main(String[] args) {
        //需求：键盘录入两个整数，求他们的和
        //2.创建键盘录入对象
        Scanner sc = new Scanner(System.in);  //第二句

        //3.提示用户录入数据，并接收
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();                  //第三句
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        //4.计算整数和
        int sum = a + b;

        //5.打印结果
        System.out.println("sum:" + sum);
    }

}
