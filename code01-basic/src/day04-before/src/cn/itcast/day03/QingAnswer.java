package cn.itcast.day03;

class QingAnswer {
    public static void main(String[] args) {
        int sum = 0;
        int i = 13;
        for(int j = 1; j <= 1000; j++) {
            if (j % 2 == 1) {
                sum += i;
            } else {
                sum -= i;
            }
            System.out.println("当前sum的值是：" + sum);
            i += 10;
            if (i > 1003) {
                break;
            }
            System.out.println("i 的值是：" + i);
        }
        System.out.println("sum 的最终结果是：" + sum);
    }
}
