package polymorphism;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/05/09 ： NWT)hxl ： 新規作成
 * @date 2021/05/09 17:18
 */
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        // No upcasting
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
