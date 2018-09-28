package cn.itcast.day03;

public class EvenNumberInLoop {
  public static void main(String[] args) {
    int sum = 0;
    int store = 0;
    for(int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {

        // sum = i;
        sum = sum + i;
        System.out.println("sum = " + sum + "\t" + "i = " + i);
      }

      // if (i % 2 == 1) {
      //   store = i;
      //
      //   continue;
      // }
      
      // System.out.println("what we hava stored are: i = " + store);

    }
    // System.out.println("-----------------------------------");
    // System.out.println("what we hava stored are: i = " + store);
  }
}
