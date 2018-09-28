package cn.itcast.day16.exception.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/6 20:29
 * @version: 1.0
 */
/*请用代码描述:
在一款角色扮演游戏中,每一个人都会有名字和生命值;
角色的生命值不能为负数
要求:当一个人物的生命值为负数的时候需要抛出自定的异常

* */
public class Practice10 {
    public static void main(String[] args) {
        RoleGame rg = new RoleGame();
        rg.setBlood(100);
        rg.setBlood(-100);
//        rg.getBlood() = -100;
        System.out.println("rg.getBlood() = " + rg.getBlood());
    }

}
