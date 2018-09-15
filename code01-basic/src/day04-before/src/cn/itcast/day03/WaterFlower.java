package cn.itcast.day03;

public class WaterFlower {
  public static void main(String[] args) {
    // for (int i = 1; i < 10; i++ ) {
    //   for(int j = 0; j < 10; j++) {
    //       for (int x = 0; x < 10; x++) {
    //           if ((i * i * i + j * j * j + x * x * x) == (i * 100 + j * 10 + x)) {
    //               System.out.println("shuixianhua shu wei: " + (i * 100 + j * 10 + x));
    //           }
    //       }
    //   }
    // }

    for (int i = 100; i < 1000; i++) {
      int bai = i / 100;
      int shi = i / 10 % 10;
      //int shi = i % 100 / 10;
      int ge = i % 10;
      int sum = bai*bai*bai + shi*shi*shi + ge*ge*ge;
      if (sum == i) {
        System.out.println("shuixianhua shu wei: i = " + i);
        continue;
      }

      // System.out.println("----------------");
      // System.out.println(" i = " + i);
      // System.out.println("=====================");

    }

  }
}
