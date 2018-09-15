package cn.itcast.day02;

public class EvaluationTest01 {
  public static void main(String[] args) {
    byte n = 5;
    //n = n % 2;
	//byte = byte + int;
	//byte = int + int;
	//byte = int;
	//n = (byte) int;
    n %= 2;
    System.out.println(n);
  }
}
