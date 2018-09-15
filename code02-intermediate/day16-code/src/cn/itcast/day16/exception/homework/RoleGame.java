package cn.itcast.day16.exception.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/6 20:30
 * @version: 1.0
 */
/*请用代码描述:
在一款角色扮演游戏中,每一个人都会有名字和生命值;
角色的生命值不能为负数
要求:当一个人物的生命值为负数的时候需要抛出自定的异常
*/
public class RoleGame {
    private String name;
    private Integer blood;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleGame roleGame = (RoleGame) o;

        if (name != null ? !name.equals(roleGame.name) : roleGame.name != null) return false;
        return blood != null ? blood.equals(roleGame.blood) : roleGame.blood == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (blood != null ? blood.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RoleGame{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        /*角色的生命值不能为负数
要求:当一个人物的生命值为负数的时候需要抛出自定的异常*/
        if (blood < 0) {
            try {
                throw new NoBloodException ("生命值为负");
            } catch (NoBloodException e) {
                e.printStackTrace();
            }
        }
        this.blood = blood;
    }

    public RoleGame(String name, Integer blood) {
        this.name = name;
        this.blood = blood;
    }

    public RoleGame() {
    }
}
