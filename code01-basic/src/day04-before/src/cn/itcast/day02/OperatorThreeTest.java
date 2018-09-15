package cn.itcast.day02;

public class OperatorThreeTest {
  public static void main(String[] args) {

    int middle = (20 > 40 ? 20 : 40);
		int finnal = (middle > 30 ? middle : 30);

    int i = (20 > 40)&&( 20 > 30) ? 20 : (40 > 30 ? 40 :30);
    int allInOne = ((20 > 40 ? 20 : 40) > 30) ? (20 > 40 ? 20 : 40) : 30;
		System.out.println(finnal);
    System.out.println(allInOne);
    System.out.println("-------------");
    System.out.println(i);

    System.out.println("-------------");
    int x = 20;
    int y = 40;
    int z = 30;

    int max = ((x > y ? x : y) > z) ? (x > y ? x : y) : z;
    System.out.println(max);
    System.out.println("=============");
    // int otherMaxWay = ((x > y) && (x < y)) > z ? (x > y) && (x < y) : z;
    //
    // int otherMaxWay = ((x > y) && (x < y)) > z ? (x > y) && (x < y) : z;
    //
    // int otherMaxWay = ((x > y) && (x > z)) > z ? (x > y) && (x < y) : z;
    //
    // int otherMaxWay = (x > y) && (x > z) > x ? x :((y > z) ? y : z);
    int otherMaxWay = (x > y) && (x > z) ? x :((y > z) ? y : z);

    System.out.println(otherMaxWay);


    //
  }
}
