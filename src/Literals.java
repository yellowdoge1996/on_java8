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
 * @date 2021/4/12 19:13
 */
public class Literals {
    public static void main(String[] args) {
        // 16进制 (小写)
        int i1 = 0x2f;
        System.out.println(
                "i1: " + Integer.toBinaryString(i1));
        // 16进制 (大写)
        int i2 = 0X2F;
        System.out.println(
                "i2: " + Integer.toBinaryString(i2));
        // 8进制 (前导0)
        int i3 = 0177;
        System.out.println(
                "i3: " + Integer.toBinaryString(i3));
        // 最大 char 型16进制值
        char c = 0xffff;
        System.out.println(
                "c: " + Integer.toBinaryString(c));
        // 最大 byte 型16进制值  01111111;
        byte b = 0x7f;
        System.out.println(
                "b: " + Integer.toBinaryString(b));
        // 最大 short 型16进制值
        short s = 0x7fff;
        System.out.println(
                "s: " + Integer.toBinaryString(s));
        // long 型后缀
        long n1 = 200L;
        // long 型后缀 (容易与数值1混淆)
        long n2 = 200l;
        long n3 = 200;

        // Java 7 二进制字面值常量:
        byte blb = (byte)0b00110101;
        System.out.println(
                "blb: " + Integer.toBinaryString(blb));
        short bls = (short)0B0010111110101111;
        System.out.println(
                "bls: " + Integer.toBinaryString(bls));
        int bli = 0b00101111101011111010111110101111;
        System.out.println(
                "bli: " + Integer.toBinaryString(bli));
        long bll = 0b00101111101011111010111110101111;
        System.out.println(
                "bll: " + Long.toBinaryString(bll));
        float f1 = 1;
        float f2 = 1F; // float 型后缀
        float f3 = 1f; // float 型后缀
        double d1 = 1d; // double 型后缀
        double d2 = 1D; // double 型后缀
        // (long 型的字面值同样适用于十六进制和8进制 )
    }
}
