package cn.itcast.demo;
//案例
//获取两个整数的最大值
import java.util.Scanner;

public class IfDemo4anli {
    public static void main(String[] args) {
        //需求：键盘录入两个数据，获取这两个数据的最大值
        //1.创建键盘录入对象，以便接受录入的数据（包含：导包，创建对象）
        Scanner sc = new Scanner(System.in);

        //2.提示用户录入两个整数，并接收
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();

        //3.定义变量，记录最大值
        int max;

        //4.通过if语句的第二种格式，判断两个整数的最大值
        if (a >=b){
            max = a;
            //走到这，说明a大
        }else{
            max = b;
            //走到这，说明b大
        }

        //5.将结果打印到控制台上
        System.out.println("最大值" + max);

    }
}
