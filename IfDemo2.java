package cn.itcast.demo;
//If第二种格式
/*
   选择结构之If语句
      第二种格式
         if （关系表达式）{
         语句体1
         } else {
         语句体2
         }
    执行流程：
        先判断关系表达式，看其是否成立（true成立，false不成立）
        如果关系表达式成立，则执行语句体1
        如果关系表达式不成立，则执行语句体2
 */
public class IfDemo2 {
    public static void main(String[] args) {
        //需求：判断两个是否相等，如果相等则打印相等，不相等则打印不相等
        int a = 10;
        int b = 20;

        //调用if第二种格式
        System.out.println("开始执行");
        if(a == b){
            //能走这里，则变量相等
            System.out.println("相等");
        }else{
            //能走这里，说明不相等
            System.out.println("不相等");
        }
        System.out.println("结束执行");
    }
}
