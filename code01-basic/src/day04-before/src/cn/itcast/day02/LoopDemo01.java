package cn.itcast.day02;

/**
 * @author Rekol
 */
public class LoopDemo01 {
  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      System.out.println("HelloLOOP~~~" + i);
    }
    System.out.println("++++++++++++++++++++++++++++");

    int j = 1;
    while(j < 100) {
      System.out.println("HelloWhile~~~" + j);
      j++;
    }

    System.out.println("++++++++++++++++++++++++++");

    int x = 1;
    do {
      System.out.println("HelloDoWhile~~~" + x);
      x++;
    }
    while (x < 100);
    System.out.println("KEY:x =" + x );//100
    System.out.println("KEY:x =" + j );//100
//    System.out.println("KEY:x =" + i );//找不到 i ,超过作用域.


  }
}
