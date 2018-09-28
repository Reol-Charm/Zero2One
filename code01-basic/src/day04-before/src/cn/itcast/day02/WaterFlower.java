package cn.itcast.day02;

/**
 * @author Rekol
 */
public class WaterFlower {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++ ) {
      for(int j = 0; j < 10; j++) {
          for (int x = 0; x < 10; x++) {
              if ((i * i * i + j * j * j + x * x * x) == (i * 100 + j * 10 + x)) {
                  System.out.println("shuixianhua shu wei: " + (i * 100 + j * 10 + x));
              }
          }
      }
    }
  }
}
