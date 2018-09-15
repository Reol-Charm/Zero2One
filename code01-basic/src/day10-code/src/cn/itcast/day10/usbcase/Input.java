package cn.itcast.day10.usbcase;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/22 11:16
 * @version:         1.0
 *
 */

public interface Input {
    public static final int AGE_FROM_SCANNER = 23;
    double POUND2KG = 2.204623;
    double INCH2CENTIMETRE = 0.393701;
    

    public abstract double getWeight();

    public abstract double getHeight();

    public default double herrisBeneformula() {
        return 0.0;
    }

}
