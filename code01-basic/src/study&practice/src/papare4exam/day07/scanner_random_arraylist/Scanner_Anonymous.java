package papare4exam.day07.scanner_random_arraylist;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/22 9:47
 * @version:         1.0
 *
 */


import java.util.Scanner;

public class Scanner_Anonymous {

    public static void main(String[] args) {
//       普通方式    
        Scanner sc = new Scanner(System.in);
        input(sc);

//匿名对象作为方法接收的参数
        input(new Scanner(System.in));
    }

    public static void input(Scanner sc) {
        System.out.println(sc);
    }
}
