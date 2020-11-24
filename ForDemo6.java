package cn.itcast.demo;

import org.w3c.dom.ls.LSOutput;

//案例：统计所有的“水仙花数”的个数
public class ForDemo6 {
    public static void main(String[] args) {
        //1.定义一个计算器，记录水仙花数的个数
        int count = 0;
        //2.获取所有的三位数
        for (int i = 100; i < 1000; i++) {
            //3.获取个位，十位，百位数字
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            //4.判断是否为水仙花数，如果是，计数器自增1
            if ( ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                //三种格式：都可以
                //count = count + 1;
                //count++;
                ++count;
            }
        }
        System.out.println("水仙花数的个数是" + count);
    }


}
