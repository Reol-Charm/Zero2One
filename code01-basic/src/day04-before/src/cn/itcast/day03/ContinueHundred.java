package cn.itcast.day03;

public class ContinueHundred {
  public static void main(String[] args) {
    int jsum = 0;
    int osum = 0;
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 1) {
        jsum += i;
        System.out.println("jishu i: " + i);
        System.out.println("jishusum =" + jsum);
        continue;
      }
      System.out.println("===================");
      osum += i;
      System.out.println("oushu i: " + i);
      System.out.println("oushusum =" + osum);
      System.out.println();

    }
  }
}
