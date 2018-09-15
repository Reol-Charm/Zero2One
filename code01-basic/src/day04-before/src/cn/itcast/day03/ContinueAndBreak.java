package cn.itcast.day03;

public class ContinueAndBreak {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println("it's " + i + " floor." );
    }
  }
}
