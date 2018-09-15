package me.rekolcharm.selftaughtbook;
/**@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/26 11:25
 * @version:         1.0
 *
 */
public class DynamicBinding extends Father{
    public static void main(String[] args) {
        Father son = new DynamicBinding();

        Father.say();
        say();
    }
    public static void say(){
        System.out.println("son say()");
    }

}
