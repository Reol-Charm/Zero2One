package cn.itcast.day14.homework;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/4 16:21
 * @version: 1.0
 */
/*九、ArrayList集合中有如下内容： {33,11,77,55}，
使用Collections.sort()对ArrayList集合中的数据
进行排序，并打印出排序后的结果。*/
/*练习十：LinkedList使用
十、已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，
将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
*/
public class Practic10 {
    public static void main(String[] args) {
        /*todo util包下的常用工具类*/
        /*todo 遍历数组的两种方式*/
        /*todo 字符串的 length 属性和数组 length() 方法*/

        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        /*将该数组里面的所有qq号都存放在LinkedList中*/
        LinkedList<String> list = new LinkedList<>(Arrays.asList(strs));
        /*list中重复元素删除*/
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(strs[i]) && strs[i].equals(list.get(i))) {
                System.out.println("list.get(" + i + ") = " + list.get(i));
            }
        }
        System.out.println("linkedList = " + list);
    }


}


//        while (linkedList.iterator().hasNext()) {
//            System.out.println("linkedList.iterator().next() = " + linkedList.iterator().next());
//        }
//
//        System.out.println("-------------------");
//
//        for (String s : linkedList) {
//            System.out.println(s);
//        }
