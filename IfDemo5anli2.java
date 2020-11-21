package cn.itcast.demo;


import java.util.Scanner;

//案例2
//根据学生成绩判断级别
public class IfDemo5anli2 {
    public static void main(String[] args) {
        /*
        需求：键盘录入学生考试成绩，请根据成绩判断该学生在哪个级别
        90-100 皇帝
        80-90  宰相不包含90
        70-80  大臣不包含80
        60-70  县官不包含70
        60以下  草民不包含60
         */
        //1.创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //2.提示学生录入成绩，并接收
        System.out.println("输入你的成绩");
        int score = sc.nextInt();

        //3.根据学生录入的成绩，和题设的条件进行对比，并按照要求输出即可
        if (score >=90 && score <=100){
            System.out.println("皇帝");
        } else if (score >=80 && score <90){
            System.out.println("宰相");
        }else if (score >=70 && score <80){
            System.out.println("大臣");
        }else if (score >=60 && score <70){
            System.out.println("县官");
        }else if (score >=0 && score <60){
            System.out.println("草民");
        }else {
            System.out.println("你不是正常人吧");
        }
    }
}
