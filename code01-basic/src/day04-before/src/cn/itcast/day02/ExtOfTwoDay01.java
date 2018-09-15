package cn.itcast.day02;

public class ExtOfTwoDay01 {
  public static void main(String[] args) {
    int x = 20;
    int y = 40;
    int z = 30;

    int max = x > y ? x : y;
    max = max > z ? max : z;
    System.out.println(max);
  }
}
