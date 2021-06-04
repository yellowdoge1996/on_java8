/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/4/12 ： NWT)hxl ： 新規作成
 * @date 2021/4/12 19:27
 */
public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);
    }
}
