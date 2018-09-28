package cn.itcast.day02;

class FlowerNum01 {
   public static void main(String[] args) {
     //随机数字153,407
    int num = 407;
    //  int b = 6, s = 2, g = 4;
    int b = num / 100;
    int s = (num / 10) % 10;
    int s2 = (num % 100) / 10;
    int g = num % 10;
    int re = b * b * b + s * s * s + g * g * g;
     System.out.println(re);
   }
 }
