package cn.itcast.demo;
//案例：1024程序员节发橙子
public class SendOrangeDemo {
    public static void main(String[] args) {
        /*需求：1024程序员节发橙子，
          已知条件：
             假设有三个班级，每个班级有35个同学，现在要将100个橙子分别发放给每一个同学，没人只能拿一个
             如果该同学已经有了橙子，则不在发给该同学，如果橙子发完了，则发放活动终止
             假设编号为5的倍数的同学都有了橙子
         */
        //1.定义变量，记录发送橙子的总数
        int count = 0;
        //2.通过for循环，获取每一个班级
        A:for (int i = 1; i < 4; i++) {
            //3.在班级for循环当中，用for获取每一个同学
            for (int j = 1; j < 36; j++) {
                //4.判断该学生是否有橙子
                if (j % 5 == 0){
                    //5.如果有，就不发了
                    continue ;
                }
                //6.如果没有，就给该同学发橙子
                System.out.println("正在给"+ i +"班级的"+ j +"发送橙子");
                //7.每发送一个橙子，计数器都要加1
                count++;
                //8.如果橙子发完，活动就结束
                if (count >=100){
                    break A;
                }
            }
            System.out.println();
        }
        //9.打印发送橙子的数量
        System.out.println("总共发送了" + count + "个橙子");
    }
}
