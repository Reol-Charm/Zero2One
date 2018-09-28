package cn.itcast.day11.asparameter;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 10:02
 * @version:         1.0
 *
 */

class Role {
    private String name;
    private int age;
    private int blood;
    private Armour ar;
    private Weapon wp;


    /*public role(String name, int age, int blood, Armour ar, Weapon wp) {
        this.name = name;
        this.age = age;
        this.blood = blood;
        this.ar = ar;
        this.wp = wp;
    }*/

    public Role() {

    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public void attack() {
        System.out.println("use " + wp.getName() + ", 造成 " + wp.getHurt() + " dianshanghai");

    }
    public void wear() {
        System.out.println("wear " + ar.getName() + ", the blood increase: " + ar.getBlood());

    }

}

