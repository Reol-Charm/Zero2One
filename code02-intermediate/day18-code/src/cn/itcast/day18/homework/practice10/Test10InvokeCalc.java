package cn.itcast.day18.homework.practice10;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 9:28
 * @version: 1.0
 */

public class Test10InvokeCalc {
    public static void main(String[] args) {
        //请分别使用Lambda【标准格式】及【省略格式】调用invokeCalc方法来计算130-120的结果
        int a = 130;
        int b = 120;
        invokeCalc(a, b, (int c, int d) -> {
            return (c - d);
        });
        invokeCalc(a, b, (c, d) -> (c - d));

    }



    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }

}
