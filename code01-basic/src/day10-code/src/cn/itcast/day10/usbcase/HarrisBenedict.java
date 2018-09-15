package cn.itcast.day10.usbcase;

import java.util.Scanner;

/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/22 11:07
 * @version:         1.0
 *
 */


class Harris implements Input {

    Scanner sc = new Scanner(System.in);

    @Override
    public double getWeight() {
        System.out.println("input your weight(kg): ");
        return sc.nextDouble();
    }

    @Override
    public double getHeight() {
        System.out.println("input your height(cm): ");
        return sc.nextDouble();
    }

    @Override
    public double herrisBeneformula() {
        double formulaValue = 66 + (6.23 * getWeight() * POUND2KG)
                + (12.7 * getHeight() * INCH2CENTIMETRE) - (6.8 * AGE_FROM_SCANNER);
        return formulaValue;

    }
}


public class HarrisBenedict {
    public static void main(String[] args) {
        Input input = new Harris();
        System.out.println("ha.herrisBeneformula() = "
                + input.herrisBeneformula());

        double moderatelyActive = input.herrisBeneformula() * 1.55 + 250;
        System.out.println("moderatelyActive = " + moderatelyActive);

    }

}
