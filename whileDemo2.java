package cn.itcast.demo;
//案例:计算1-100之间的数字之和
public class whileDemo2 {
    public static void main(String[] args) {
        int sum = 0;//计数器为0
        int i = 1;
        while (i <=100){
            sum = sum + i;//如果i小于等于100，执行sum加i
            i++;   //i+1返回判断语句
        }
        System.out.println(sum);//打印sum
    }
}
