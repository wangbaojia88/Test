package cn.itcast.demo;
//案例：计算1-100的偶数和
public class ForDemo4 {
    public static void main(String[] args) {
        //需求：计算1-100的偶数和
        //1.定义一个求和变量
        int sum = 0;
        //2.获取1-100之间所有的数据
        for (int i = 1;i <=100;i++) {
            //3.判断当前的数据是否为偶数，是就累加
            if (i % 2 ==0) {
                //偶到这里：说明i是偶数，累加
                sum += i;
            }
        }
        //4.打印结果
        System.out.println("sum:"+sum);
    }
}
