/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/4/16 ： NWT)hxl ： 新規作成
 * @date 2021/4/16 16:14
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues() {
        System.out.println("Data type Initial value");
        System.out.println("boolean " + t);
        System.out.println("char[" + c + "]");
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("reference " + reference);
    }

    public static void main(String[] args) {
        new InitialValues().printInitialValues();
    }
}
