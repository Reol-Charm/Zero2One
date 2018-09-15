package cn.itcast.day11.asparameter;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 9:37
 * @version:         1.0
 *
 */


public class Test {
    public static void main(String[] args) {
        Weapon wp = new Weapon("SU", 2222);
        Armour ar = new Armour("Hello",23232);
        Role r = new Role();

        r.setWp(wp);
        r.setAr(ar);
        r.attack();
        r.wear();

        NewRole nr = new NewRole();

        nr.setMa(new MagicAttack() {
            @Override
            public void magicAttack() {
                System.out.println("override the magicAttack() in Interface.");
            }
        });

        nr.magicAttack();
    }
}
