package cn.itcast.day02;

/**
 * @author Rekol
 */
public class LogicTest01 {
  public static void main(String[] args) {
    int a = 100;
    int b = 100;
    int max = a > b ? a : b;//a <= b的情况下,输出b;
    System.out.println(max);//100
    System.out.println("------------");

    // int result = 3 > 4 ? 2.5 : 10;
    // System.out.println(result);
    System.out.println(3 > 4 ? 2.5 : 10);//10.0
    System.out.println(a > b ? a : b);//100
//    a > b ? a : b;
  }
}
