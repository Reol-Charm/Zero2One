package cn.itcast.day05.arraywithfor;

public class ArrayReverseDemo01 {
    public static void main(String[] args) {
        int[] arr = {11, 121, 232, 434, 555, 654, 666};

        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            if ( max % 2 ==0 && min % 2 ==0) {//偶数索引值互换.
                int temp = arr[max];
                arr[max] = arr[min];
                arr[min] = temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
