package cn.test.demo;

/**
 * 三元运算符：
 *    概述：
 *        也叫三目运算符，即由三部分组成
 *
 *    格式：
 *        关系表达式？表达式1：表达式2;
 *    执行流程：
 *       先判断关系表达式是否成立，
 *       成立，执行表达式1，
 *       不成立，执行表达式2
 *
 */
public class OperatorDemo7 {
    public static void main(String[] args) {
      //需求：求两个整数的最大值
      //1.定义两个变量记录两个整数
      int a = 10;
      int b = 20;

      //2.通过三元运算符计算它们的最大值
      int max = (a >= b) ? a : b ;

      //3.将结果打印到控制台上
        System.out.println("max:" + max);
    }
}
