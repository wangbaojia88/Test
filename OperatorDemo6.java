package cn.test.demo;

/**
 * 逻辑运算符：
 *     分类：
 *        逻辑与：&&，并且的关系，要求所有条件满足，即有false则整体为false
 *        逻辑或：||，或者的关系，要求只要满足任意一个条件即可，既有true则整体为true
 *        逻辑非：!，取反的意思，以前为false，现在为true；以前为true，现在为false
 *
 *
 *    注意：
 *       偶数个逻辑非，结果不变
 */
public class OperatorDemo6 {
    public static void main(String[] args) {
        //案例：韦小宝找媳妇儿

        //刚开始眼光比较高，要求要长得好看，还要身材好
        //前边的true表示：长得好看，false表示长得不好看
        //后边的true表示：身材好，false表示身材不好
        System.out.println(true && true);  //输出结果：true
        System.out.println(true && false);  //输出结果：false
        System.out.println(false && true);  //输出结果：false
        System.out.println(false && false);  //输出结果：false
        System.out.println("---------------------");

        //韦小宝发现那样的媳妇儿不好找，于是降低了择偶标准，只要长得好看，或者身材好就行
        System.out.println(true || true);  //输出结果：true
        System.out.println(true || false);  //输出结果：true
        System.out.println(false || true);  //输出结果：true
        System.out.println(false || false);  //输出结果：false
        System.out.println("---------------------");

        //韦小宝发现那样的媳妇儿还是不好找，于是降低了择偶标准，只要不是男的就行
        //true:女   false：男
        System.out.println(!true);  //false
        System.out.println(!false);//true
        System.out.println("------------------");

        System.out.println(!!!!!!!true);  //false
    }
}
