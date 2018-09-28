package cn.itcast.day14.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/4 15:47 - 16:20
 * @version: 1.0
 */
/*七、向list集合添加姓名
{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。*/
public class Practice07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
//todo replaceAll() "元素替换的方法总结"

        for (int i = 0; i < list.size(); i++) {
            if("二丫".equals(list.get(i))){
                list.set(i, "王小丫");
                System.out.println("list1 = " + list);

            }
        }
        int count = 0;
        for (String s : list) {
            if ("二丫".equals(s)) {
                list.set(count, "王小丫");
                System.out.println("list2 = " + list);
            }
            count++;
        }
    }
}
