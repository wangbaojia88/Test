/*
   标识符：
       组成：
           英文大小写字母，数字，下划线_,美元符号$
       命名规则；
           遵循驼峰命名，见明知意。
           类和接口；所有的单词首字母大写，其他小写
           变量和方法；首字母小写，如有多个单词，从第二个单词开始首字母大写
           常量名；所有字母都大写，多个单词用下划线隔开
           包名；全部小写，如果有多级，用.隔开，遵循域名反写的格式
               包；
                 其实就是文件夹，用来区分重名类的
       注意事项；
             1.不能以数字开头
             2.不能和Java的关键字重名
             3.严格区分大小写

 */
public class Identifier {
    public static void main(String[] args) {瞎搞报错了吧
        //定义变量，记录张三的年龄
        int zhangSanAge = 23;
        System.out.println(zhangSanAge);

        int b2 = 20;
        //int 2b = 20;   注意事项1
        System.out.println(b2);

        //int class = 10; 2.不能和Java的关键字重名
        int classnumber = 10;
        System.out.println(classnumber);

        //3.严格区分大小写,变量a和变量A是不一样的
        int a = 10;
        int A = 11;
        System.out.println(a);
        System.out.println(A);
    }
}
