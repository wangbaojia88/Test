package cn.itcast.demo;
//案例：按班级获取所有同学（3个班级，5个同学）
public class ForForDemo {
    public static void main(String[] args) {
        //原始做法
        /*for (int i = 1; i <= 5 ; i++) {
            System.out.println("正在获取第1个班级的" + i + "名学生");
        }
        System.out.println(); //换行

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("正在获取第2个班级的" + i + "名学生");
        }
        System.out.println();//换行

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("正在获取第3个班级的" + i + "名学生");
        }
        System.out.println();//换行*/

        //用循环方法优化

        //1.通过for循环获取每一个班级
        for (int a = 1; a < 4; a++) {   //外循环 获取每一个班级
            //2.再次通过for循环获取每一个班级的学生
            for (int i = 1; i <= 5 ; i++) {  //内循环  获取当前班级的每一名同学
                //3.直接打印学生的信息即可
                System.out.println("第"+ a +"的班级的第" + i + "的学生");
                System.out.println();
            }
        }
    }
}
