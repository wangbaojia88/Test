package cn.test.demo;
/*
算数运算符：
  分类：	1. +：加法运算
	    2. -：减法运算
	    3. *：乘法运算
	    4. /：除法运算
	    5. %：取模（取余）运算
     	6. ++：自增
	    7. --：自减
/和%的区别：
   /：除法运算符：得到两个数据相除的商
   %取模（取余）运算，得到两个数据相除的余数
注意：
    整数相除的结果还是整数
    想要得到小数，就必须有浮点数参与计算
 */
public class OperatorDemo {
    public static void main(String[] args) {
        //定义两个int类型的变量
        int a = 5;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("-----------------------------------------");
        System.out.println(5/4);
        System.out.println(5.0/4);
        System.out.println(5/4.0);
    }
}
