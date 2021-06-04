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
public class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }
    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
