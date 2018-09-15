package cn.itcast.day11.asparameter;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/23 9:23
 * @version: 1.0
 */
class Armour {
    private String name;
    private int blood;

    public Armour(String armour, int blood) {
        this.setName(armour);
        this.setBlood(blood);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}

class Weapon {
    private String name;
    private int hurt;


    public Weapon(String su, int hurt) {
        this.setName(su);
        this.setHurt(hurt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}

