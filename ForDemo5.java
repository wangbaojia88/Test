package cn.itcast.demo;
//案例：在控制台上输出所有的“水仙花数”
public class ForDemo5 {
    public static void main(String[] args) {
        //1.通过for循环获取所有的三位数
        for  (int i = 100;i <1000;i++){
        //2.获取该数据的个位，十位，百位数字
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i /10 /10 % 10;
        //3.判断该数据是否为水仙花数，如果是打印即可
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                //能走到这里说明是水仙花数，打印即可
                System.out.println(i);
            }
        }

    }
}
