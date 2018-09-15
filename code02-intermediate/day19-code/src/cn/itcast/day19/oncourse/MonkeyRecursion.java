package cn.itcast.day19.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/12 11:27
 * @version: 1.0
 */
/*练习三:递归的使用(二)
描述:猴子吃桃子问题，
猴子第一天摘下若干个桃子，
当即吃了快一半，还不过瘾，又多吃了一个。
第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
以后每天都吃了前一天剩下的一半多一个。
到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
*/
/*
令S10=1,容易看出S9=2(S10+1),
S9=2S10+2
S8=2S9+2
…..
Sn=2S(n+1)+2
简化一下
s10 = s9/2 – 1  s9 / 2 = s10 + 1
 S9=2(S10+1)
*/


public class MonkeyRecursion {
    public static void main(String[] args) {
        // 定义桃子数量调用递归方法
        int sum = sumPeach(1);
        // 调用递归函数并打印
        System.out.println(sum);
    }

    public static int sumPeach(int day) {
        // 判断如果是第10天就返回1
        if (day == 10) {
            return 1;
        } else {
            // 递归计算前一天的数量
//            return 2 * sumPeach(day + 1) + 2;
            /*return peachNum(day + 1 + peachNum(day - 1) / 2);*/
            return sumPeach(++day) * 2 + 2;
        }
    }
}
