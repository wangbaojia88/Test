package cn.itcast.demo;
//案例：用while循环打印5次HelloWorld
public class whileDemo {
    /*
    while循环的格式：
      初始化语句；
      while（判断条件语句）{
            循环体语句；
            控制条件语句；
      }
     */
    public static void main(String[] args) {
        //方式一：for循环打印
        //初始化语句；判断条件语句；控制条件语句；
        for (int i = 1;i <=5;i++){
            //循环体语句
            System.out.println("HelloWorld");
        }
        System.out.println("-------------------");
        //方式二：while循环打印
        int i = 1;
        while (i <=5){
            System.out.println("HelloWorld");
            i++;
        }
    }
}
