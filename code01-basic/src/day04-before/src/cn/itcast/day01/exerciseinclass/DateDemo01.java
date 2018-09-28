package cn.itcast.day01.exerciseinclass;

public class DateDemo01 {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(max);//2147483647
		System.out.println("------------");
		System.out.println(max + 1);//-2147483648
		System.out.println(max + 2);//-2147483647
		
		System.out.println(max + 2L);//2147483649
		System.out.println((long)max + 2);//2147483649
		
		//System.out.println((Long)max + 2);����: �����ݵ�����: int�޷�ת��ΪLong
	}
}