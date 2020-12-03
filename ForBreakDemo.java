package cn.itcast.demo;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

//案例
public class ForBreakDemo {
    public static void main(String[] args) {
        /*需求：程序员同学受邀加入A公司，现按班级查找程序员同学
        已知：
            现有3个班级，每班10个同学，
            假设第二个班级的第五位同学名叫程序员，找出该同学后停止寻找。
        */
        //1.通过for循环，获取每一个班级
        label_class:
        for (int a = 1; a < 4; a++) {   //外循环，用于获取每个班级
            //2.在班级循环中，再次通过for循环获取到每一个学生的信息
            for (int i = 1; i < 11; i++) {    //内循环，用于获取当前班级的每个同学
                //3.打印当前学生的信息
                System.out.println("正在寻找第" + a + "个班级的第" + i + "个学生");
                //4.判断当前学生是否是程序员同学，（第2个班级的第5为同学）
                if (a == 2 && i == 5) {
                    System.out.println("哈哈哈，找到了程序员");
                    //5.如果是，则结束整个循环
                    break label_class;
                }
            }
            System.out.println();
        }
    }
}
