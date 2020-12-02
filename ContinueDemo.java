package cn.itcast.demo;
//需求：逢7必过案例
public class ContinueDemo {
    public static void main(String[] args) {
        //1.通过for循环获取1-100之间所有的数据
        for (int i = 1;i <=100;i++){
            //2.判断当前数据是否为合法数据
            //   包含7或7的倍数是不合法的
            if(i % 10 == 7 || i / 10 % 10 ==7 || i % 7 ==0){
                System.out.println("...");
                //3.如果数据不合法，之间跳过本次循环，直接进行下次循环
            continue;
            }
            //4.如果数据合法，直接打印即可
            System.out.println(i);
        }
    }
}
