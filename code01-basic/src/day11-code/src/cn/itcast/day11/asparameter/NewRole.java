package cn.itcast.day11.asparameter;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 10:03
 * @version:         1.0
 *
 */

/**
 * @author Rekol
 */
public class NewRole extends Role {
    MagicAttack ma;

    public void setMa(MagicAttack ma) {
        this.ma = ma;
    }

    //    @Override
    public void magicAttack() {
        System.out.println("launch magic attack!");
        // 测试就近原则.
//        Anonymous inner class only use once.
        (new MagicAttack() {
            @Override
            public void magicAttack() {
                System.out.println("NewRole's anonymous inner method.");
            }
//            invoke itself
        }).magicAttack();

//      invoke the second anonymous class.
        ma.magicAttack();//NullPointerException

        System.out.println("End the attack.");
    }
}
