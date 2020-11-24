package cn.itcast.demo;
//案例：计算1-5之间的数据之和，并输出总和
public class ForDemo3 {
    public static void main(String[] args) {
        //1.定义求和变量sum
        int sum = 0;

        //2.i记录的就是1-5之间的所有数字
        for (int i = 1;i <=5;i++){
            //3.把获取的数据依次累计加到给便变量sum

           // sum = sum + i;  两步都可以
            sum += i;
        }
        //4.打印结果
        System.out.println(sum);
    }
}
